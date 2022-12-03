/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 
 */
public class SqlMetodo {
    public static conexionBD conexion=new conexionBD();
    
    public static PreparedStatement sentencia;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadonum = 0;
    
    public int guardar(String nombre,String correo,String contraseña) {
        int resultado=0;
        Connection Conexion=null;
        
        
         String sentenciaguardar= ("INSERT INTO usuarios (nombre,correo,contraseña) VALUES(?,?,?)");
        
        try{
            conexion=(conexionBD) conexionBD.conectar();
            sentencia=conexion.prepareStatement(sentenciaguardar);
            sentencia.setString(1, nombre);
             sentencia.setString(2, correo);
              sentencia.setString(3, contraseña);
              
              resultado=sentencia.executeUpdate();
              sentencia.close();
        } catch(SQLException e){
            System.out.println(e);
    }  
return resultado;
        }
}
