package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
     private Connection conexion;
    
    private String host = "localhost";
    private String usuario = "root";
    private String password = "";
    private String nombreDB = "speedlist";
    
    private String url = "jdbc:mysql://"+host+"/"+nombreDB;
    
    public Connection conectar(){
        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.conexion = DriverManager.getConnection(this.url, this.usuario, this.password);
            
        }catch (Exception e){
            System.out.println("Error de conexión BD: "+e.getMessage());
        }
        
        return this.conexion;
    }
}
