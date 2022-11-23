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
    
    String[] columns = {"TableroID", "Estado", "Nombre", "Apellidos", "Correo",
             "Nomusuario", "Contraseña"};
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    BoardDao board = new BoardDao();
    private ArrayList<Student> arrayStd = new ArrayList<>();
    
    public boolean signIn(Student std){
        boolean save = false;
        this.getRegisters();
        int idBoard = board.getIdfromLast();
        try{
            rs.updateInt("TableroId",idBoard);
            rs.updateInt("Estado", std.getStatus());
            rs.updateString("Nombre", std.getName());
            rs.updateString("Apellidos", std.getLastNames());
            rs.updateString("Correo", std.getEmail());
            rs.updateString("Username", std.getUserName());
            rs.updateString("Password", std.getPassword());
        }catch (SQLException ex){
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

    public void fillArrayStd() {
        this.getRegisters();
        try {
            while (rs.next()) {
                Student student = new Student(rs.getInt("EstudianteID"), rs.getInt("TableroID"), rs.getInt("Estado"),
                rs.getString("Nombre"), rs.getString("Apellidos"), rs.getString("Correo"), rs.getString("Nomusuario"),
                rs.getString("Contraseña"));
                 this.addStudent(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            int idBoard = board.getIdfromLast(); 
            System.out.println(idBoard);
            st.executeUpdate("INSERT INTO Estudiantes " + 
            "VALUES(" + idBoard +", " + a.getStatus() +", '" + a.getName() +"', '" + a.getEmail()  
            +"', '" + a.getUserName() +"', '" + a.getPassword() + "')", columns);
            
                         guardado = true;
            
        } catch (SQLException ex) {
            System.out.println("Error al guardar Estudiante: " + ex.getMessage());
        } 
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (ps != null) {
//                    ps.close();
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

}
