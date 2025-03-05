import java.util.Scanner;

public class SpartanII extends Spartan {
    public SpartanII(String nombre,int salud,String arma, int escudo) {
        super(nombre,salud,arma,escudo);
    }
    public void usarManejoAvanzado(){
        System.out.println("El Spartan" + nombre+ "tiene escudo extra y tacticas de combate avenzadas");
}
}