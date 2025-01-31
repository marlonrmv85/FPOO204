import java.util.*;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la base del árbol:");
        int base = sc.nextInt();

        int i = 1;
        while (i <= base) {
            int espacios = base - i;
            int j = 0;


            while (j < espacios) {
                System.out.print(" ");
                j++;
            }

            j = 0;
            while (j < (2 * i - 1)) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }


    }
}
