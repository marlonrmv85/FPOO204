/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintaxis;


//importaciones
import java.util.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author marlo
 */

//clase principal
public class Sintaxis {

    /**
     * @param args the command line arguments
     */
    //metodo principal
    public static void main(String[] args) {
        // cadenas
       System.out.println("hola Marlon Mendieta");
        
        String cadenas = "marlon + mendieta + valadez";
        
        System.out.println(cadenas);
        
        System.out.println(cadenas.length());
        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));
        
        //-3. variables
      /*  int x=5,x2;
        double y=1.25,y2;
        String z="204",z1;
        
        x2=Integer.parseInt(z);
        z1=String.valueOf(y);
        double asd=Double.valueOf(x);
        
        
        
        //conversión implicita
        int num=12;
        double numD=num;
        System.out.println("conversión implicita"+numD);
        
        
        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);
        
        //creamos un objeto rdn de una clase Random
        Random rdn=new Random();
        
        //generamos numeros y los guardamos
        int numAleatorio=rdn.nextInt();
        double numDouble=rdn.nextDouble();
        System.out.println("aleatorio entero:"+numAleatorio);
        System.out.println("aleatorio double:"+numDouble);

        
        
        //4. Solicitud de datos
        
        Scanner scn=new Scanner(System.in);
        
        System.out.println("introduce cualquier dato");
        String dato=scn.nextLine();
        
        System.out.println("introduce un dato entero");
        int datoentero=scn.nextInt();
        
        System.out.println("introduce datos decimales");
        double datodecimal=scn.nextDouble();
        
        System.out.println("cualquier dato"+dato);
        scn.nextLine();
        System.out.println("dato entero"+datoentero);
        scn.nextLine();
        System.out.println("dato decimal"+datodecimal);
        scn.nextLine();
            
        
        
//5. boolean, operadores logicos y de comparacion
      /* System.out.println(10>9);//true
       System.out.println(10==9);//false
       System.out.println(10<9);//false
       System.out.println(10>=9);//true
       System.out.println(10<=9);//false
       System.out.println(10!=9);//true
       
       int x=3;
       System.out.println(x<5&&x>10);//false
       System.out.println(x<5||x>10);//true
       System.out.println(!(x<5&&x>10));//true
/*

*/
       
      
      
    }
    
}
