/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marlon;

/**
 *
 * @author marlo
 */
import java.util.Random;

public class MatriculaGenerator {
    private Estudiante estudiante;

    public MatriculaGenerator(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String generar() {
        char primeraLetraNombre = estudiante.getNombre().toUpperCase().charAt(0);
        String dosLetrasApellidoPaterno = estudiante.getApellidoPaterno().toUpperCase().substring(0, Math.min(2, estudiante.getApellidoPaterno().length()));
        String dosLetrasApellidoMaterno = estudiante.getApellidoMaterno().toUpperCase().substring(0, Math.min(2, estudiante.getApellidoMaterno().length()));
        String dosUltimosAñoNacimiento = estudiante.getAñoNacimiento().substring(Math.max(0, estudiante.getAñoNacimiento().length() - 2));
        String tresLetrasCarrera = estudiante.getCarrera().toUpperCase().substring(0, Math.min(3, estudiante.getCarrera().length()));

        Random random = new Random();
        int digito1 = random.nextInt(10);
        int digito2 = random.nextInt(10);

        return primeraLetraNombre +
                dosLetrasApellidoPaterno +
                dosLetrasApellidoMaterno +
                dosUltimosAñoNacimiento +
                (java.time.Year.now().getValue() % 100) +
                tresLetrasCarrera +
                digito1 + digito2;
    }
}