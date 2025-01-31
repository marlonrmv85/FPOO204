
import java.util.*;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;
        System.out.println("Escriba la bitácora de operaciones:");

        while (true) {
            String linea = sc.nextLine().trim();
            if (linea.isEmpty()) {
                break;
            }

            String[] partes = linea.split(" ");
            if (partes.length == 2) {
                String operacion = partes[0];
                int cantidad;

                try {
                    cantidad = Integer.parseInt(partes[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Cantidad no válida.");
                    continue;
                }

                if (operacion.equalsIgnoreCase("D")) {
                    saldo += cantidad;
                } else if (operacion.equalsIgnoreCase("R")) {
                    saldo -= cantidad;
                } else {
                    System.out.println("Operación no válida. Use 'D' para depósito o 'R' para retiro.");
                }
            } else {
                System.out.println("Formato incorrecto. Use 'D cantidad' o 'R cantidad'.");
            }
        }
        System.out.println("Saldo final: " + saldo);
    }
}
