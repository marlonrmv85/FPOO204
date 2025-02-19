import javax.swing.*;
import java.util.*;

class Generador {
    public String generarPassword(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()-_+=<>?/";

        String caracteres = minusculas + numeros;
        if (incluirMayusculas) {
            caracteres += mayusculas;
        }
        if (incluirEspeciales) {
            caracteres += especiales;
        }

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }

    public String evaluarSeguridad(int longitud) {
        if (longitud >= 1 && longitud <= 4) {
            return "No segura";
        } else if (longitud >= 5 && longitud <= 6) {
            return "Segura";
        } else if (longitud >= 7 && longitud <= 9) {
            return "Muy segura";
        } else {
            return "Súper segura";
        }
    }
}