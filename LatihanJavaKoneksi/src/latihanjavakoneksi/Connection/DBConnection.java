/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.Connection;
import java.sql.*;

/**
 *
 * @author basazard
 */
public class DBConnection {
    public Connection open(){
        Connection con;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mysql://127.0.0.1/latihanjava";
            
            con = DriverManager.getConnection(url, "root", "");
            
            return con;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
