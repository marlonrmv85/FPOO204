
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n1. Crear Vehículo\n2. Crear Conductor\n3. Asignar Conductor a Vehículo\n4. Crear Envío\n5. Crear Entrega\n6. Salir");

            switch (opcion) {
                case "1":
                    Vehiculo vehiculo = new Vehiculo();
                    break;
                case "2":
                    Conductor conductor = new Conductor();
                    break;
                case "3":
                    vehiculo = new Vehiculo();
                    conductor = new Conductor();
                    vehiculo.asignarConductor(conductor);
                    break;
                case "4":
                    Envio envio = Envio.crearEnvio();
                    break;
                case "5":
                    String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                    Entrega entrega = new Entrega(numeroGuia);
                    entrega.actualizarEstado();
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
