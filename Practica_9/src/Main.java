import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola, bienvenido al banco CAJA POPULAR");

        
        String ID = JOptionPane.showInputDialog("Ingresa tu ID:");
        String Nombre = JOptionPane.showInputDialog("Ingresa tu Nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));

        Usuario usuario = new Usuario(ID, Nombre, edad);

        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Depositar", "Retirar", "Consultar Saldo", "Depositar a otra cuenta", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Menú Banco CAJA",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case 0:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el monto a depositar:"));
                    usuario.depositar(deposito);
                    break;
                case 1:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el monto a retirar:"));
                    usuario.retirar(retiro);
                    break;
                case 2:
                    usuario.consultar_saldo();
                    break;
                case 3:
                    String IDDestino = JOptionPane.showInputDialog(null, "Ingresa el ID al que vas a depositar:");
                    double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el monto a depositar:"));
                    usuario.depositarOtraCuenta(IDDestino, monto);
                    break;
                case 4:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}
