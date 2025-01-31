import java.util.*;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        5. Escribir un programa en el que se pregunte al usuario por una frase y una letra,
//        y muestre por pantalla el número de veces que aparece la letra en la frase.

//        System.out.println("ingresa una frase");
//        String frase = sc.nextLine();
//
//        System.out.println("ingresa la letra que quieres contar");
//        String letra = sc.nextLine();
//
//        int indice = frase.indexOf("m");
//        System.out.println(indice);
        // Preguntar al usuario por una frase y una letra
        System.out.println("Ingresa una frase:");
        String frase = sc.nextLine();

        System.out.println("Ingresa la letra que quieres contar:");
        char letra = sc.next().charAt(0);

        // Contar ocurrencias de la letra en la frase
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");

    }
}
