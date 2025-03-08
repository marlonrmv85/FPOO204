
import javax.swing.*;
import java.util.ArrayList;


class Practica_15{
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;

        do {
            String menu = "1. Agregar Conductor\n2. Agregar Administrativo\n3. Listar Empleados\n4. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String nombreC = JOptionPane.showInputDialog("Ingrese el nombre del Conductor:");
                    int idC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
                    double salarioC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));
                    String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
                    empleados.add(new Conductor(nombreC, idC, salarioC, licencia));
                    break;
                case 2:
                    String nombreA = JOptionPane.showInputDialog("Ingrese el nombre del Administrativo:");
                    int idA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
                    double salarioA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
                    empleados.add(new Administrativo(nombreA, idA, salarioA, departamento));
                    break;
                case 3:
                    if (empleados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    } else {
                        for (Empleado e : empleados) {
                            e.mostrarInfo();
                        }
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 4);
    }
}
