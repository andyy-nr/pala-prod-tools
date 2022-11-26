/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entities.Course;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrea Nunez
 */
public class CourseDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void getRegisters() {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from Asignatura";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Course> getData() {
        this.getRegisters();
        ArrayList<Course> result = new ArrayList<>();
        try {
            while (rs.next()) {
                Course course = new Course(rs.getString("Nombre"));
                result.add(course);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public ArrayList<Course> getDatawithID() {
        this.getRegisters();
        ArrayList<Course> result = new ArrayList<>();
        try {
            while (rs.next()) {
                Course course = new Course(
                        rs.getString("Nombre"),
                        rs.getInt("AsignaturaID")
                );
                result.add(course);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public int getCourseID(String name) {
        this.getRegisters();
        try {
            while (rs.next()) {
                Course course = new Course(
                        rs.getString("Nombre"),
                        rs.getInt("AsignaturaID"));
                if (course.getName().equals(name)) {
                    return course.getID();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return 0;
    }

    public boolean saveCourse(String cName) {
        boolean guardado = false;
        this.getRegisters();
        try {
            Statement st = conn.createStatement();
            rs.moveToInsertRow();
            rs.updateString("Nombre", cName);
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

    public boolean deleteCourse(String name) {
        boolean resp = false;
        this.getRegisters();
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getString("Nombre").equals(name)) {
                    rs.deleteRow();
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al eliminar curso" + ex.getMessage());
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
