/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contraseña;

/**
 *
 * @author marlo
 */
import javax.swing.*;
import java.util.*;

public class Contraseña {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola, bienvenido al generador de passwords");
        
        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Sí", "No"};
            int eleccion = JOptionPane.showOptionDialog(null, "¿Deseas generar una contraseña?", "Generador de passwords",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            
            if (eleccion == 1) {
                salir = true;
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema.");
                break;
            }
            
            String input = JOptionPane.showInputDialog("Indica la longitud de la contraseña (mínimo 1, máximo 20):");
            int longitud;
            try {
                longitud = Integer.parseInt(input);
                if (longitud < 1 || longitud > 20) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa un número entre 1 y 20.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Ingresa un número entero.");
                continue;
            }
            
            String password = generarPassword(longitud);
            String seguridad = evaluarSeguridad(longitud);
            
            JOptionPane.showMessageDialog(null, "Contraseña generada: " + password + "\nNivel de seguridad: " + seguridad);
        }
    }
    
    public static String generarPassword(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }
        
        return password.toString();
    }
    
    public static String evaluarSeguridad(int longitud) {
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
