/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author HP
 */
public class Estudiante{
 private  String idA;
    public String nombresA;
    public String pApellidoA;
    public String sApellidoA;
    public String correoA;
    private String contraseñaA;

    
    public Estudiante() {
        
    }

    public Estudiante(String idA, String nombresA, String pApellidoA, String sApellidoA, String correoA, String contraseñaA) {
        this.idA = idA;
        this.nombresA = nombresA;
        this.pApellidoA = pApellidoA;
        this.sApellidoA = sApellidoA;
        this.correoA = correoA;
        this.contraseñaA = contraseñaA;
    }

    public String getIdA() {
        return idA;
    }

    public void setIdA(String idA) {
//         if(idA < 6){
//            throw new IllegalArgumentException("La cédula tiene que tener al menos 6 dígitos");
//        }
        this.idA = idA;
    }

    public String getNombresA() {
        return nombresA;
    }

    public void setNombresA(String nombresA) {
//        if(nombresA.length() < 3){
//            throw new IllegalArgumentException("El nombre tiene que tener mínimo 3 letras");
//        }
        this.nombresA = nombresA;
    }

    public String getpApellidoA() {
        return pApellidoA;
    }

    public void setpApellidoA(String pApellidoA) {
//        if(pApellidoA.length() < 3){
//            throw new IllegalArgumentException("El apellido tiene que tener mínimo 3 letras");
////        }
        this.pApellidoA = pApellidoA;
    }

    public String getsApellidoA() {
        return sApellidoA;
    }

    public void setsApellidoA(String sApellidoA) {
        if(pApellidoA.length() < 3){
            throw new IllegalArgumentException("El apellido tiene que tener mínimo 3 letras");
        }
        this.sApellidoA = sApellidoA;
    }

    public String getCorreoA() {
        return correoA;
    }

    public void setCorreoA(String correoA) {
        this.correoA = correoA;
    }

    public String getContraseñaA() {
        return contraseñaA;
    }

    public void setContraseñaA(String contraseñaA) {
        this.contraseñaA = contraseñaA;
    }

   
    
}
