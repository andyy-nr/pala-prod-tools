/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entities.Course;
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
public class CourseTaskDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    public void getRegisters() {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from AsignaturaTarea";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Task> getDatafromCourseID(int idCourse, ArrayList<Task> tasks) {
        this.getRegisters();
        ArrayList<Task> result = new ArrayList<>();
        try {
            while (rs.next()) {
                Task task = new Task(rs.getInt("EstudianteID"),
                        rs.getString("Nombre"),
                        StatusTask.valueOf(rs.getString("Estado"))
                );
                result.add(task);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public boolean saveCourse(Course c, Task t) {
        boolean guardado = false;
        this.getRegisters();
        try {
            Statement st = conn.createStatement();
                rs.moveToInsertRow();
                rs.updateString("Nombre", c.getName());
                rs.insertRow();
                rs.moveToCurrentRow();   
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
