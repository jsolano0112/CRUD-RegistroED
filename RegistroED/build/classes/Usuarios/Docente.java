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
        this.idD = idD;
    }

    public String getNombresD() {
        return nombresD;
    }

    public void setNombresD(String nombresD) {
        this.nombresD = nombresD;
    }

    public String getpApellidoD() {
        return pApellidoD;
    }

    public void setpApellidoD(String pApellidoD) {
        this.pApellidoD = pApellidoD;
    }

    public String getsApellidoD() {
        return sApellidoD;
    }

    public void setsApellidoD(String sApellidoD) {
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
