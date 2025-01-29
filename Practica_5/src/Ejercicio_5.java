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

        String mensaje = "Este mensaje posee muchas letras a";
        int indicePrimeraA = mensaje.indexOf("a");
        int indiceSegundaA = mensaje.indexOf("a",indicePrimeraA + 1 );
    }
}
