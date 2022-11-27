/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entities.StatusTask;
import static entities.StatusTask.NotStarted;
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
    StatusTask sts = NotStarted;

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

    public ArrayList<Task> getDatafromStdID(int id) {
        this.getRegisters();
        ArrayList<Task> result = new ArrayList<>();
        try {
            while (rs.next()) {
                Task task = new Task(
                        rs.getInt("EstudianteID"),
                        rs.getString("Descripcion"),
                        StatusTask.valueOf(rs.getString("Estado"))
                );
                if (task.getStudentId() == id) {
                    result.add(task);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public int getTaskID(String desc) {
        this.getRegisters();
        try {
            while (rs.next()) {
                Task task = new Task(
                        rs.getString("Descripcion"),
                        rs.getInt("TareaID"));
                if (task.getDescription().equals(desc)) {
                    System.out.println(task.getTaskId());
                    return task.getTaskId();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return 0;
    }

    public Task getTaskfromID(int id, int stdId) {
        this.getRegisters();
        try {
            while (rs.next()) {
                Task task = new Task(
                        rs.getInt("TareaID"),
                        rs.getInt("EstudianteID"),
                        rs.getString("Descripcion"),
                        StatusTask.valueOf(rs.getString("Estado"))
                );
                if (task.getTaskId() == id && task.getStudentId() == stdId) {
                    return task;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public boolean saveTask(Task t) {
        boolean guardado = false;
        this.getRegisters();
        try {
            Statement st = conn.createStatement();

            rs.moveToInsertRow();
            rs.updateInt("EstudianteID", t.getStudentId());
            rs.updateString("Estado", String.valueOf(t.getStatus()));
            rs.updateString("Descripcion", t.getDescription());
            rs.insertRow();
            rs.moveToCurrentRow();

            guardado = true;

        } catch (SQLException ex) {
            System.out.println("Error trying to save task " + ex.getMessage());
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

    public boolean deleteTask(String name) {
        boolean resp = false;
        this.getRegisters();
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getString("Descripcion").equals(name)) {
                    rs.deleteRow();
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error trying to delete task" + ex.getMessage());
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
}
