/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entities.StatusTask;
import entities.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrea Nunez
 */
public class TaskDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    ArrayList<String> courseNames = new ArrayList<>();

    public void fillcourseNames() {
        courseNames.add("asignatura 1");
        courseNames.add("asignatura 2");
        courseNames.add("asignatura 3");
        courseNames.add("asignatura 4");
        courseNames.add("asignatura 5");
        courseNames.add("asignatura 6");
    }

    public void getRegisters() {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from Tarea";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Task> getData() {
        this.getRegisters();
        ArrayList<Task> result = new ArrayList<>();
        try {
            while (rs.next()) {
                Task task = new Task(
                        rs.getInt("EstudianteID"),
                        rs.getString("Estado"),
                        StatusTask.valueOf(rs.getString("Descripción"))
                );
                
                result.add(task);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public ArrayList<Task> getDatafromID(int id) {
        this.getRegisters();
        ArrayList<Task> result = new ArrayList<>();
        try {
            while (rs.next()) {
                Task task = new Task(
                        rs.getInt("EstudianteID"),
                        rs.getString("Nombre"),
                        StatusTask.valueOf(rs.getString("Estado"))
                );
                if (task.getStudentId() == id){
                    result.add(task);  
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public boolean saveCourse() {
        boolean guardado = false;
        this.getRegisters();
        try {
            Statement st = conn.createStatement();
            for (String cName : courseNames) {
                rs.moveToInsertRow();
                rs.updateString("Nombre", cName);
                rs.insertRow();
                rs.moveToCurrentRow();
            }

            guardado = true;

        } catch (SQLException ex) {
            System.out.println("Error trying to save course " + ex.getMessage());
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
}
