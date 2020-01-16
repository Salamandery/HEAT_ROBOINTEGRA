/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo_integra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Supplier;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author rodolfo.abreu
 */
public class dbConnect extends javax.swing.JFrame {

// dados do banco
    private static String driver;
    private static String user, pass, url;

    public static Connection getConnect() throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            user = "USER";
            pass = "PASS";
            url = "jdbc:oracle:thin:@IP:PORT:SCHEMA";
            driver = "oracle.jdbc.driver.OracleDriver";
            Class<?> forName = Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "Conexão não pode ser estabelecida, entre em contato com suporte do sistema! "+ ex.getMessage());
        }
        return con;
    }
    
    public static void FechaConnect(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "Não foi possivel fechar a conexão, "+e.getMessage());
        }
    } 
    public static void FechaConnect(Connection con, PreparedStatement stmt) {
        try {
            if (con != null) {
                FechaConnect(con);
            }
            if (stmt != null ) {
                stmt.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "Não foi possivel fechar o Statement, "+e.getMessage());
        }
    } 
    public static void FechaConnect(Connection con, PreparedStatement stmt, ResultSet rs) {
        try {
            if (con != null || stmt != null) {
                FechaConnect(con, stmt);
            }
            if (rs != null ) {
                rs.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "Não foi possivel fechar o ResultSet, "+e.getMessage());
        }
    } 
}
