import java.util.*;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        4. Escribir un programa que pida al usuario un número entero y muestre por
//        pantalla un triángulo rectángulo como el de más abajo, de altura el número
//        introducido. (img 1)


        System.out.println("Introduce la altura del triángulo (entero positivo):");
        int altura = sc.nextInt();

        if (altura > 0) {
            for (int i = 1; i <= altura; i++) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("La altura debe ser un número entero positivo.");


        }
    }
}
