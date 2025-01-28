



import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//1. Escribir un programa que almacene la cadena de caracteres una contraseña
//en una variable, después que solicite al usuario una contraseña e imprima en
//pantalla si la contraseña introducida por el usuario coincide con la guardada en
//la variable sin tener en cuenta mayúscula y minúscula.

 String contraseña=("vuala");
 Scanner sc = new Scanner(System.in);

System.out.println("Porfavor ingresa tu contraseña");
String c =sc.nextLine();

        if (c.equals(contraseña)){
            System.out.println("La contraseña es correcta");



        }
            else{
                System.out.println("la contraseña es incorrecta");
        }


    }
    }
