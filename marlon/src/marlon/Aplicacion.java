/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marlon;

/**
 *
 * @author marlo
 */
import javax.swing.JOptionPane;

public class Aplicacion {
    public void ejecutar() {
        Estudiante estudiante = capturarDatosEstudiante();

        if (estudiante == null) {
            JOptionPane.showMessageDialog(null, "Faltaron datos, intenta de nuevo.");
            return;
        }

        MatriculaGenerator generador = new MatriculaGenerator(estudiante);
        String matricula = generador.generar();

        JOptionPane.showMessageDialog(null, "Tu matrícula es: " + matricula);
    }

    private Estudiante capturarDatosEstudiante() {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String apellidoPaterno = JOptionPane.showInputDialog("Ingresa tu apellido paterno:");
        String apellidoMaterno = JOptionPane.showInputDialog("Ingresa tu apellido materno:");
        String añoNacimiento = JOptionPane.showInputDialog("Ingresa tu año de nacimiento (00/00/00):");
        String carrera = JOptionPane.showInputDialog("Ingresa tu carrera:");

        if (nombre == null || apellidoPaterno == null || apellidoMaterno == null ||
            añoNacimiento == null || carrera == null ||
            nombre.trim().isEmpty() || apellidoPaterno.trim().isEmpty() ||
            apellidoMaterno.trim().isEmpty() || añoNacimiento.trim().isEmpty() || carrera.trim().isEmpty()) {
            return null;
        }

        return new Estudiante(nombre, apellidoPaterno, apellidoMaterno, añoNacimiento, carrera);
    }
}