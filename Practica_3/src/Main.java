//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Programa 1: programa que pregunte al usuario por el numero de horas
        //trabajadas y el coste por hora. Después debe mostrar por pantalla
        //la paga que le corresponde

Scanner sc = new Scanner(System.in);

//System.out.println("Hola bienvenido a la calculadora de salario");
//System.out.println("Porfavor ingrese su total de horas trabajadas");
//double horas=sc.nextDouble();
//
//System.out.println("\n");
//
//System.out.println("Porfavor ingrese el costo por hora");
//double costo=sc.nextDouble();
//
//double paga=horas*costo;
//System.out.println("su paga correspondiente es igual a:"+paga);

        // 2. Codifica un programa que pregunte el nombre completo del usuario en la
        //consola y después muestre por pantalla el nombre completo del usuario tres
        //veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y
        //otra solo con la
        //primera letra del nombre y de los apellidos en mayúscula. El usuario puede
        //introducir su nombre combinando mayúsculas y minúsculas como quiera.
//
//System.out.println("Hola ingresa tu nombre completo porfavor");
//String nombre = sc.nextLine();
//
//
//System.out.println(""+nombre.toUpperCase());//función que permite al usuario ingresar datos en minusculas y arroja todo con mayusculas
//System.out.println(""+nombre.toLowerCase());//funcion que permite al usuario ingresar datos en minusculas y arroja todo en minusculas
//        System.out.println(obtenerIniciales(nombre));
//    }
//
//    public static String obtenerIniciales(String nombre) {
//        String[] palabras = nombre.split(" ");
//        StringBuilder iniciales = new StringBuilder();
//
//        for (String palabra : palabras) {
//            if (!palabra.isEmpty()) {
//                iniciales.append(Character.toUpperCase(palabra.charAt(0)));
//            }
//        }
//
//        return iniciales.toString();
//


//3. Escribir un programa que solicite un entero X, introducido por el usuario y
//después
//muestre en pantalla la suma de todos los enteros desde 1 hasta X .
//
//        System.out.println("Ingresa un número entero:");
//        int num = sc.nextInt();
//
//        int suma = 0;
//        for (int i = 1; i <= num; i++) {
//            suma += i;
//        }
//
//        System.out.println("La suma de todos los enteros desde 1 hasta " + num + " es: " + suma);


//4. Codifica un programa que pregunte el nombre del usuario y después de que
//el usuario lo introduzca muestre por pantalla <NOMBRE> tiene <n> letras,
//donde<NOMBRE> es el nombre de usuario en mayúsculas y <n> es el número
//de letras que tienen el nombre.
//System.out.println("ingresa tu nombre porfavor");
//String cadena=sc.nextLine();
//
//System.out.println(""+cadena.toUpperCase());
//System.out.println("tu nombre tiene esta cantidad de letras:");
//System.out.println(cadena.length());

//5. Una juguetería tiene mucho éxito en dos de sus productos: payasos y
//muñecas. Suele hacer venta por correo y la empresa de logística les cobra por
//peso de cada paquete así que deben calcular el peso de los payasos y muñecas
//que saldrán encada paquete a demanda. Cada payaso pesa 112 g y cada
//muñeca 75 g.
//        int pesoPayaso = 112;
//        int pesoMuñeca = 75;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese la cantidad de payasos: ");
//        int cantidadPayasos = scanner.nextInt();
//        System.out.print("Ingrese la cantidad de muñecas: ");
//        int cantidadMuñecas = scanner.nextInt();
//
//        int pesoTotal = (cantidadPayasos * pesoPayaso) + (cantidadMuñecas * pesoMuñeca);
//        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");






//6. Crea un programa que pida al usuario que introduzca una frase en y muestre
//en pantalla la frase invertida.
//
System.out.println("Holal ingresa una frase porfavor");
StringBuilder frase = new StringBuilder(sc.nextLine());
System.out.println("reverse(" + frase + ") = " + frase.reverse());

        }
    }
