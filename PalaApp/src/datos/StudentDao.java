/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entities.Student;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private ArrayList<Student> arrayStd = new ArrayList<>();
    
    public boolean sigIn(Student std){
        boolean save = false;
        this.getRegisters();
        try{
            rs.updateString("Firstname", std.getName());
            rs.updateString("Lastname", std.getLastNames());
            rs.updateString("Email", std.getEmail());
            rs.updateString("Password", std.getPassword());
            rs.updateString("Username", std.getUserName());
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

        } catch (Exception ex) {
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
            };
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
}
