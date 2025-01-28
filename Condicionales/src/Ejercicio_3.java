
import java.util.*;
public class Ejercicio_3 {

    public static void main(String[] args) {

//        3. Escribir un programa para una empresa que tiene salas de juegos para todas
//        las edades y quiere calcular de forma automática el precio que debe cobrar a
//        sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente
//        y mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar
//        gratis, si tiene entre 4 y 18 años debe pagar $110 y si es mayor de 18 años, $190

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su edad");
        int edad = sc.nextInt();

        if(edad<4){
            System.out.println("Puedes entrar gratis");
        }
        if (edad >= 4 && edad <= 17) {
            System.out.println(" el costo de su entrada es: $110.");
        } else {
            System.out.println("el costo de su entrada es: $190.");
        }
//d
        }
    }
