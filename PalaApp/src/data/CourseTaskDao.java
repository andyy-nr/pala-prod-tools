/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entities.CourseTask;
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
        ArrayList<Task> tasksInCourse = new ArrayList<>();
        ArrayList<CourseTask> tasksfromCourse = new ArrayList<>();
        ArrayList<Task> tasks = td.getDatafromStdID(idStd);

        for (Task task : tasks) {
            CourseTask ct = new CourseTask(idCourse, task.getTaskId());
            tasksfromCourse.add(ct);
        }
        try {
            while (rs.next()) {
                for (CourseTask ct : tasksfromCourse) {
                    if (rs.getInt("TareaID") == ct.getTaskID() && rs.getInt("AsignaturaID") == ct.getCourseID()) {
                        tasksInCourse.add(td.getTaskfromID(ct.getTaskID()));
                        System.out.print(tasksInCourse);
                    }
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
            rs.updateInt("AsignaturaID", ct.getCourseID());
            rs.updateInt("TareaID", ct.getTaskID());
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
