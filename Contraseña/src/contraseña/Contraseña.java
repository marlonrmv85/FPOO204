/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contraseña;

import javax.swing.*;

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

            try {
                int longitud = Integer.parseInt(JOptionPane.showInputDialog("Indica la longitud de la contraseña (mínimo 1, máximo 20):"));

                GeneradorContraseña generador = new GeneradorContraseña(longitud);

                JOptionPane.showMessageDialog(null, "Contraseña generada: " + generador.getContraseña() +
                        "\nNivel de seguridad: " + generador.evaluarSeguridad());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Ingresa un número entero.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
