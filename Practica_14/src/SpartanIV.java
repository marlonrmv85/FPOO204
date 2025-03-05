public class SpartanIV extends Spartan{
    public SpartanIV(String nombre,int salud,String arma, int escudo) {
        super(nombre,salud,arma,escudo);
    }

    public void usarPropulsores(){
        System.out.println("El Spartan" + nombre + " Usa propulsores para invisibilidad");
}
}