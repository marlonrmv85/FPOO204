package contraseña;

import java.util.Random;

public class GeneradorContraseña {
    private int longitud;
    private String contraseña;

    // Constructor
    public GeneradorContraseña(int longitud) {
        setLongitud(longitud); // Usa el setter para validar el rango
        this.contraseña = generarPassword();
    }

    // Getters y Setters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        if (longitud >= 1 && longitud <= 20) {
            this.longitud = longitud;
        } else {
            throw new IllegalArgumentException("La longitud debe estar entre 1 y 20.");
        }
    }

    public String getContraseña() {
        return contraseña;
    }


    private String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }


    public String evaluarSeguridad() {
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
