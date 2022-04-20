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
import Usuarios.Docente;
import java.util.ArrayList;
import java.sql.ResultSet;


public class DocenteDao {
    
       private Conexion conexion = new Conexion();
    
   
    //CREATE
    
    public boolean crearDocente(Docente doc) throws SQLException{
        
    
    
    boolean fueAgregado = false;
    
    Connection conn = conexion.conectar();
    
    try{
        String sql = "insert into docente values(?,?,?,?,?,?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        stmt.setInt(1, doc.getIdD());
        stmt.setString(2, doc.getNombresD());
        stmt.setString(3, doc.getpApellidoD());
        stmt.setString(4, doc.getsApellidoD());
        stmt.setString(5, doc.getCorreoD());
        stmt.setString(6, doc.getContraseñaD());
        
        int cantidad = stmt.executeUpdate();
        
        fueAgregado = (cantidad > 0);
        
} catch (Exception e){
        System.out.println("ERROR AL CREAR NUEVO DOCENTE: "+e.getMessage());
}finally{
        conn.close();
    }
    
    return fueAgregado;
}
    
    //READ
    
    public ArrayList<Docente> leerDocente() throws SQLException{
        ArrayList<Docente> doc = new ArrayList<>();
        Connection conn = conexion.conectar();
        
        try {
            String sql = "SELECT idDocente,nombresD,apellidoD1,apellidoD2,correoD FROM docente";
            PreparedStatement pt = conn.prepareStatement(sql);
            ResultSet resul = pt.executeQuery();
            
            
            //Se recorre los datos
            while(resul.next()){
                Docente doct = new Docente();
                doct.setIdD(resul.getInt("idDocente"));//trae lo que esté en la columna rut y guardelo en set
                doct.setNombresD(resul.getString("nombresD"));
                doct.setpApellidoD(resul.getString("apellidoD1"));
                doct.setsApellidoD(resul.getString("apellidoD2"));
                doct.setCorreoD(resul.getString("correoD"));
              
                
                //guardar trabajador cuando esten listos los datos
                doc.add(doct);
            }
        } catch (Exception e) {
            System.out.println("Error listado"+e.getMessage());
        }finally{
            conn.close();
        }
        return doc;
    }
    
    //READ FOR ID
   
     public ArrayList<Docente> leerDocente(int idD) throws SQLException{
        ArrayList<Docente> doc = new ArrayList<>();
        Connection conn = conexion.conectar();
        
        try {
            String sql = "SELECT idDocente,nombresD,apellidoD1,apellidoD2,correoD FROM docente WHERE idDocente = ?";
            PreparedStatement pt = conn.prepareStatement(sql);
            pt.setInt(1, idD);
            ResultSet resul = pt.executeQuery();
            
            
            //Se recorre los datos
            while(resul.next()){
                Docente doct = new Docente();
                
                doct.setIdD(resul.getInt("idDocente"));//trae lo que esté en la columna rut y guardelo en set
                doct.setNombresD(resul.getString("nombresD"));
                doct.setpApellidoD(resul.getString("apellidoD1"));
                doct.setsApellidoD(resul.getString("apellidoD2"));
                doct.setCorreoD(resul.getString("correoD"));
                //guardar trabajador cuando esten listos los datos
                doc.add(doct);
            }
        } catch (Exception e) {
            System.out.println("ERROR LISTADO: "+e.getMessage());
        }finally{
            conn.close();
        }
        return doc;
    }
    
    //UPDATE
    
    public  boolean actualizarDocente(Docente alumno) throws SQLException{
        boolean fueEditado = false;
        Connection conn = conexion.conectar();
        try{
           String sql = "UPDATE docente SET nombresD = ?, apellidoD1 = ?, apellidoD2 = ?, correoD = ? WHERE idDocente = ?";
           PreparedStatement stmt = conn.prepareStatement(sql);
         
           stmt.setString(1, alumno.getNombresD());
           stmt.setString(2, alumno.getpApellidoD());
           stmt.setString(3, alumno.getsApellidoD());
           stmt.setString(4, alumno.getCorreoD());
           stmt.setInt(5, alumno.getIdD());
           
           System.out.println(stmt);
           
           int cantidad = stmt.executeUpdate();
           
           fueEditado = (cantidad > 0);
           
        } catch (Exception e){
            System.out.println("ERROR AL ACTUALIZAR: " + e.getMessage());
        }finally{
            conn.close();
        }
        return fueEditado;
        
        
    }
    
    //DELETE
    
     public boolean eliminarDocente(int idD) throws SQLException{
         
        boolean fueEliminado = false;
        
        Connection conn = conexion.conectar();
        
        try {
            String sql = "DELETE FROM docente WHERE idDocente = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idD);
            
            //validacion corta
            fueEliminado = (ps.executeUpdate()>0);
                    
        } catch (Exception e) {
            System.out.println("ERROR AL ELIMINAR DOCENTE: "+e.getMessage());
        } finally {
            conn.close();
        }
        return fueEliminado;
    }
}
