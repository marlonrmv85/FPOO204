

import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {

//
//        programa con funciones y un menu que nos permita convertir temperaturas a decision del usuario:
//        (Fahrenheit-32)*5/9    G Fahrenheit=(centigrados*9/5)+32  G Kelvin= centigrados +273.15
    Scanner sc = new Scanner(System.in);
    int f;
    System.out.println("ingresa la temperatura");
                System.out.println("Ingresa la temperatura que quieres convertir:");
                double temperatura = sc.nextDouble();

                System.out.println("Selecciona la conversión:");
                System.out.println("1. Convertir a grados Centígrados");
                System.out.println("2. Convertir a grados Fahrenheit");
                System.out.println("3. Convertir a grados Kelvin");

                int op = sc.nextInt();
                double resultado;

                switch (op) {
                    case 1:
                        resultado = (temperatura - 32) * 5 / 9;
                        System.out.println("Temperatura en Centígrados: " + resultado);
                        break;
                    case 2:
                        resultado = (temperatura * 9 / 5) + 32;
                        System.out.println("Temperatura en Fahrenheit: " + resultado);
                        break;
                    case 3:
                        resultado = temperatura + 273.15;
                        System.out.println("Temperatura en Kelvin: " + resultado);
                        break;
                    default: System.out.println("Opción no válida.");
                }


            }
        }



