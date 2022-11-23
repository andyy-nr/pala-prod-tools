/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entities.Board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lopez
 */
public class BoardDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    ArrayList<Board> arrayBoard = new ArrayList<>();
    
    public ArrayList<Board> getArrayBoard() {
        return arrayBoard;
    }

    public void setArrayBoard(ArrayList<Board> arrayBoard) {
        this.arrayBoard = arrayBoard;
    }
    
    public void addBoard(Board bd) {
        arrayBoard.add(bd);
    }
    
    public void getRegisters() {
        try {
            conn = Conexion.getConnection();
            String tSQL = "Select * from Tablero";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public int getIdfromLast() {
        int id = 0;
        try {
            conn = Conexion.getConnection();
            String tSQL = "SELECT TOP 1 * FROM Tablero ORDER BY ID DESC";
            ps = conn.prepareStatement(tSQL, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
            id = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
    
    public void fillArrayStd() {
        this.getRegisters();
        try {
            while (rs.next()) {
                Board board = new Board();
                this.addBoard(board);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public boolean saveBoard(Board a) {
        boolean guardado = false;
        this.getRegisters();
        try {
            rs.moveToInsertRow();
            rs.insertRow();
            rs.moveToCurrentRow();
            guardado = true;
        } catch (SQLException ex) {
            System.out.println("Error al guardar tablero: " + ex.getMessage());
        } 
        finally {
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
