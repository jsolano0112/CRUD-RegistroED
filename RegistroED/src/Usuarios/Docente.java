/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author HP
 */
public class Docente{
 private  int idD;
    public String nombresD;
    public String pApellidoD;
    public String sApellidoD;
    public String correoD;
    private String contraseñaD;

    
     public Docente() {
      
    }
     
    public Docente(int idD, String nombresD, String pApellidoD, String sApellidoD, String correoD, String contraseñaD) {
        this.idD = idD;
        this.nombresD = nombresD;
        this.pApellidoD = pApellidoD;
        this.sApellidoD = sApellidoD;
        this.correoD = correoD;
        this.contraseñaD = contraseñaD;
    }

   

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        if(idD < 6){
            throw new IllegalArgumentException("La cédula tiene que tener al menos 6 dígitos");
        }
        this.idD = idD;
    }

    public String getNombresD() {
        return nombresD;
    }

    public void setNombresD(String nombresD) {
        if(nombresD.length() < 3){
            throw new IllegalArgumentException("El nombre tiene que tener mínimo 3 letras");
        }
        this.nombresD = nombresD;
    }

    public String getpApellidoD() {
        return pApellidoD;
    }

    public void setpApellidoD(String pApellidoD) {
        if(pApellidoD.length() < 3){
            throw new IllegalArgumentException("El apellido tiene que tener mínimo 3 letras");
        }
        this.pApellidoD = pApellidoD;
    }

    public String getsApellidoD() {
        return sApellidoD;
    }

    public void setsApellidoD(String sApellidoD) {
        if(sApellidoD.length() < 3){
            throw new IllegalArgumentException("El apellido tiene que tener mínimo 3 letras");
        }
        this.sApellidoD = sApellidoD;
    }

    public String getCorreoD() {
        return correoD;
    }

    public void setCorreoD(String correoD) {
        this.correoD = correoD;
    }

    public String getContraseñaD() {
        return contraseñaD;
    }

    public void setContraseñaD(String contraseñaD) {
        this.contraseñaD = contraseñaD;
    }

    
}
