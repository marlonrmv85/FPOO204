
import java.util.*;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3. Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.


System.out.println("Ingrese un numero: ");
int num = sc.nextInt();
        for(int i=num; i<=num;i++){

            for(int j=0; j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);

            }

        }
    }
}
