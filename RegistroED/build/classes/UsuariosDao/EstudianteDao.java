/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsuariosDao;

/**
 *
 * @author HP
 */

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Usuarios.Estudiante;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class EstudianteDao {
     
   private Conexion conexion = new Conexion();
    
   
    //CREATE
    
    public boolean crearEstudiante(Estudiante alumno) throws SQLException{
        
    
    
    boolean fueAgregado = false;
    
    Connection conn = conexion.conectar();
    
    try{
        String sql = "insert into alumno values(?,?,?,?,?,?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        stmt.setString(1, alumno.getIdA());
        stmt.setString(2, alumno.getNombresA());
        stmt.setString(3, alumno.getpApellidoA());
        stmt.setString(4, alumno.getsApellidoA());
        stmt.setString(5, alumno.getCorreoA());
        stmt.setString(6, alumno.getContraseñaA());
        
        int cantidad = stmt.executeUpdate();
        
        fueAgregado = (cantidad > 0);
        
} catch (Exception e){
        System.out.println("ERROR AL CREAR NUEVO ESTUDIANTE: "+e.getMessage());
}finally{
        conn.close();
    }
    
    return fueAgregado;
}
    
    //READ
    
    public ArrayList<Estudiante> leerEstudiante() throws SQLException{
        ArrayList<Estudiante> alumno = new ArrayList<>();
        Connection conn = conexion.conectar();
        
        try {
            String sql = "SELECT idAlumno,nombresA,apellidoA1,apellidoA2,correoA FROM alumno";
            PreparedStatement pt = conn.prepareStatement(sql);
            ResultSet resul = pt.executeQuery();
            
            
            //Se recorre los datos
            while(resul.next()){
                Estudiante est = new Estudiante();
                est.setIdA(resul.getString("idAlumno"));//trae lo que esté en la columna rut y guardelo en set
                est.setNombresA(resul.getString("nombresA"));
                est.setpApellidoA(resul.getString("apellidoA1"));
                est.setsApellidoA(resul.getString("apellidoA2"));
                est.setCorreoA(resul.getString("correoA"));
              
                
                //guardar trabajador cuando esten listos los datos
                alumno.add(est);
            }
        } catch (Exception e) {
            System.out.println("Error listado"+e.getMessage());
        }finally{
            conn.close();
        }
        return alumno;
    }
    
    //READ FOR ID
   
    public ArrayList<Estudiante> buscarPorId(String idA) throws SQLException{
        ArrayList<Estudiante> alumno = new ArrayList<>();
        Connection conn = conexion.conectar();
        
        try {
            String sql = "SELECT idAlumno,nombresA,apellidoA1,apellidoA2,correoA FROM alumno WHERE idAlumno = ?";
            PreparedStatement pt = conn.prepareStatement(sql);
            pt.setString(1, idA);
            ResultSet resul = pt.executeQuery();
            
            
            //Se recorre los datos
            while(resul.next()){
                Estudiante est = new Estudiante();
               
                est.setIdA(resul.getString("idAlumno"));//trae lo que esté en la columna rut y guardelo en set
                est.setNombresA(resul.getString("nombresA"));
                est.setpApellidoA(resul.getString("apellidoA1"));
                est.setsApellidoA(resul.getString("apellidoA2"));
                est.setCorreoA(resul.getString("correoA"));
                //guardar trabajador cuando esten listos los datos
                alumno.add(est);
            }
        } catch (Exception e) {
            System.out.println("Error listado"+e.getMessage());
        }finally{
            conn.close();
        }
        return alumno;
    }
    
    //UPDATE
    
    public  boolean actualizarEstudiante(Estudiante alumno) throws SQLException{
        boolean fueEditado = false;
        Connection conn = conexion.conectar();
        try{
           String sql = "UPDATE alumno SET idAlumno = ?, nombresA = ?, apellidoA1 = ?, apellidoA2 = ?, correoA = ?, contraseñaA = ? WHERE alumno.idAlumno = ?";
           PreparedStatement stmt = conn.prepareStatement(sql);
         
           stmt.setString(1, alumno.getNombresA());
           stmt.setString(2, alumno.getpApellidoA());
           stmt.setString(3, alumno.getsApellidoA());
           stmt.setString(4, alumno.getCorreoA());
           stmt.setString(5, alumno.getContraseñaA());
           stmt.setString(6, alumno.getIdA());
           
           System.out.println(stmt);
           
           int cantidad = stmt.executeUpdate();
           
           fueEditado = (cantidad > 0);
           
        } catch (Exception e){
            System.out.println("ERROR AL ACTUALIZAE" + e.getMessage());
        }finally{
            conn.close();
        }
        return fueEditado;
        
        
    }
    
    //DELETE
    
     public boolean eliminarEstudiante(String idA) throws SQLException{
         
        boolean fueEliminado = false;
        
        Connection conn = conexion.conectar();
        
        try {
            String sql = "DELETE FROM alumno WHERE idAlumno = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idA);
            
            //validacion corta
            fueEliminado = (ps.executeUpdate()>0);
                    
        } catch (Exception e) {
            System.out.println("ERROR AL ELIMINAR ESTUDIANTE: "+e.getMessage());
        } finally {
            conn.close();
        }
        return fueEliminado;
    }

}
