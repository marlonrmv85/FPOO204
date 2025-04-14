/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marlon;

/**
 *
 * @author marlo
 */
public class Estudiante {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String añoNacimiento;
    private String carrera;

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, String añoNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.añoNacimiento = añoNacimiento;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getAñoNacimiento() {
        return añoNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }
}