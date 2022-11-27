/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entities.CourseTask;

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
    TaskDao td = new TaskDao();

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

    public ArrayList<Task> getTasksfromCourseID(int idCourse, int idStd) {
        this.getRegisters();
        System.out.println("estoy en getTasksfromCourseID"+ idStd);
        ArrayList<Task> tasksInCourse = new ArrayList<>();
        
        int taskID = 0;

        try {
            while (rs.next()) {
                if (rs.getInt("AsignaturaID") == idCourse) {
                    System.out.println("getTaksfromCourseId estudiante id "+ idStd);
                    System.out.println("getTaksfromCourseId AsignaturaID "+ rs.getInt("AsignaturaID"));
                    System.out.println("getTaksfromCourseId estudiante id "+ idCourse);
                    taskID = rs.getInt("TareaID");
                    Task oneTask = td.getTaskfromID(taskID, idStd);
                    tasksInCourse.add(oneTask);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return tasksInCourse;
    }

    public boolean saveCT(CourseTask ct) {
        boolean guardado = false;
        this.getRegisters();
        try {
            Statement st = conn.createStatement();
            rs.moveToInsertRow();
            rs.updateInt("TareaID", ct.getTaskID());
            rs.updateInt("AsignaturaID", ct.getCourseID());
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
