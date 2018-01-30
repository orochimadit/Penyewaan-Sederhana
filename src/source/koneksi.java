/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author badra
 */
public class koneksi {
    private String dbUser="root";
    private String dbPass ="";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    private boolean  cek = false;

    public koneksi() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Driver Error!" +e.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
        }
        try {
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/penyewaan",dbUser,dbPass);
            stmt= (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi error ","Connection error ",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Program akan ditutup","Warning",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }//end koneksi 
    
    public ResultSet getData(String data){
        try {
            rs = stmt.executeQuery(data);
        } catch (Exception e) {
        }
        return rs;
    }
    
    public void query(String data){
        try {
            stmt.executeUpdate(data);
        } catch (Exception e) {
            cek=true;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean getError() {
        throw new  UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
