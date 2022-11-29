/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entities.Student;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private ArrayList<Student> arrayStd = new ArrayList<>();

    public boolean signIn(Student std) {
        boolean save = false;
        this.getRegisters();
        try {
            rs.updateString("Firstname", std.getName());
            rs.updateString("Lastname", std.getLastNames());
            rs.updateString("Email", std.getEmail());
            rs.updateString("Password", std.getPassword());
            rs.updateString("Username", std.getUserName());
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save;
    }

    /*Adds an object Student to an arrayList 
    called arrayStd*/
    public void addStudent(Student std) {
        arrayStd.add(std);
    }

    /*Gets the records from the table Student */
    public void getRegisters() {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from Estudiante";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Student> getData() {
        this.getRegisters();
        ArrayList<Student> result = new ArrayList<>();
        try {
            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("EstudianteID"),
                        rs.getInt("Estado"),
                        rs.getString("Nombre"),
                        rs.getString("Apellidos"),
                        rs.getString("Correo"),
                        rs.getString("Nomusuario"),
                        rs.getString("Contraseña"));
                result.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public ArrayList<Student> getArrayStd() {
        return arrayStd;
    }

    public void setArrayStd(ArrayList<Student> arrayStd) {
        this.arrayStd = arrayStd;
    }

    public boolean saveStudent(Student a) {
        boolean guardado = false;
        this.getRegisters();
        try {
            Statement st = conn.createStatement();
            rs.moveToInsertRow();
            rs.updateInt("Estado", a.getStatus());
            rs.updateString("Nombre", a.getName());
            rs.updateString("Apellidos", a.getLastNames());
            rs.updateString("Correo", a.getEmail());
            rs.updateString("Nomusuario", a.getUserName());
            rs.updateString("Contraseña", a.getPassword());
            rs.insertRow();
            rs.moveToInsertRow();
            guardado = true;

        } catch (SQLException ex) {
            System.out.println("Error trying to save student " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    Conexion.closeConexion(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return guardado;
    }

    public int getLastRegisters() {
        ArrayList<Student> student = new ArrayList<>();
        student = this.getData();
        Student lastStudent = student.get(student.size() - 1);
        int idStd = lastStudent.getId();

        return idStd;
    }

    public Student getStudent(int id) {
        ArrayList<Student> student = new ArrayList<>();
        student = this.getData();
        for (Student std : student) {
            if (std.getId() == id) {
                return std;
            }
        }

        return null;
    }
    
    public boolean editStudent(Student s) {
        boolean resp = false;
        this.getRegisters();
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getInt("EstudianteID") == s.getId()) {
                    rs.updateInt("Estado", s.getStatus());
                    rs.updateString("Nombre", s.getName());
                    rs.updateString("Apellidos",s.getLastNames());
                    rs.updateString("Correo",s.getEmail());
                    rs.updateString("Nomusuario",s.getUserName());
                    rs.updateString("Contraseña",s.getPassword());

                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error editing" + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    Conexion.closeConexion(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resp;
    }

    /*
    public Student getStudentFromID(int id){
        ArrayList<Student> data = this.getData();
        for (Student std : data){
            if (std.getId() == id){
                return std;
            }
        }
        return null;
    }
     */
}
