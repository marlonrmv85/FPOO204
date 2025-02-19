import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola, bienvenido al generador de passwords");
        Generador generador = new Generador();

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

            int mayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas en la contraseña?", "Configuración", JOptionPane.YES_NO_OPTION);
            int especiales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales en la contraseña?", "Configuración", JOptionPane.YES_NO_OPTION);

            boolean incluirMayusculas = (mayusculas == JOptionPane.YES_OPTION);
            boolean incluirEspeciales = (especiales == JOptionPane.YES_OPTION);

            String password = generador.generarPassword(longitud, incluirMayusculas, incluirEspeciales);
            String seguridad = generador.evaluarSeguridad(longitud);

            JOptionPane.showMessageDialog(null, "Contraseña generada: " + password + "\nNivel de seguridad: " + seguridad);
        }
    }
}
