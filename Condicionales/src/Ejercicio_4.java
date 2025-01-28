import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //4. Codifica un programa que solicite una cadena de caracteres e imprima como
        //resultado si la cadena es palíndromo o no


        System.out.println("Ingresa una cadena de caracteres:");
        String p = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        String invertida = new StringBuilder(p).reverse().toString();
        if (p.equals(invertida)) {
            System.out.println(" La cadena es un palíndromo.");
        } else {
            System.out.println(" La cadena no es un palíndromo.");
        }


    }
}

