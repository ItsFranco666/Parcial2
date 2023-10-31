package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/parcial2",
           user = "root",
           pass = "";
    
    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
}
