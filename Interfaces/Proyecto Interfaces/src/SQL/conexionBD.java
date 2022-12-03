/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brian's Laptop
 */
public class conexionBD {
    public static String url="jdbc:mysql://localhost/login";
    public static String usuario="root";
    public static String  contraseña="root";
    public static String  clase="com.mysql.jdbc.Driver";
    
    public static Connection conectar() {
        Connection conexion =null;
       try {

            Class.forName(clase);
        conexion = (Connection) DriverManager.getConnection(url,usuario,contraseña);
        System.out.println("Conexion Establecida");
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
  
      }

    PreparedStatement prepareStatement(String sentenciaguardar) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    }