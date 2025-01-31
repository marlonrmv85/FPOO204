


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        1. Escribir un programa que pida al usuario un número entero positivo y muestre
//        por pantalla todos los números impares desde 1 hasta ese número separados
//        por comas.

        System.out.println("ingresa un numero entero positivo");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.print("Números impares desde 1 hasta " + num + ": ");

            for (int i = 1; i <= num; i += 2) {
                System.out.print(i);
                if (i + 2 <= num) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        } else {
            System.out.println("El número debe ser un entero positivo.");
        }
        }
    }
