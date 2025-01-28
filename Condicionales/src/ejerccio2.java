

import java.util.*;
public class ejerccio2 {

    public static void main(String[] args) {
//        2. Escribir un programa que pida al usuario un número entero y muestre por
//        pantalla si es par o impar.

        Scanner sc = new Scanner(System.in);


        System.out.println("ingresa un numero entero");
        int n=sc.nextInt();

        if(n/2==0){
            System.out.println("el numero ingresado es par");
        }

        else{
            System.out.println("el numero ingresado es impar");
        }

            }
}
