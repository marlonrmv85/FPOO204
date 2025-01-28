
import java.util.*;
public class Ejercicio_5 {
    public static void main(String[] args) {
//        5. Escribe un programa que simule una calculadora básica utilizando un switch.
//        El usuario debe ingresar dos números y un operador (+, -, *, /). Según el
//        operador ingresado, el programa debe realizar la operación correspondiente y
//        mostrar el resultado. Si el operador no es válido, el programa debe mostrar un
//        mensaje de error.

        Scanner scn = new Scanner(System.in);
        System.out.print("Ingresar un numero: ");
        double n1 = scn.nextDouble();
        System.out.print("Ingresar otro numero: ");
        double n2 = scn.nextDouble();

        System.out.print("Ingresar el operacion (+, -, *, /): ");
        char o = scn.next().charAt(0);
        double r;
        switch (o) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("No se puede realizar la division por cero");
                    return;
                }
                r = n1 / n2;
                break;
            default:
                System.out.println("Intentar nuevamente");
                return;
        }
        System.out.println("Resultado:"+r);
    }
}



