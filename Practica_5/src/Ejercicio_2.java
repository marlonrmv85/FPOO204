

import java.util.*;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        2. Escribir un programa que pida al usuario un número entero positivo y muestre
//        por pantalla la cuenta atrás desde ese número hasta cero separados por comas.

        System.out.println("ingresa un numero entero positivo");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.print("Cuenta atrás desde " + numero + " hasta 0: ");
            for (int i = numero; i >= 0; i--) {
                System.out.print(i);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("El número debe ser un entero positivo.");
        }

    }
}
