public class SpartanIII extends Spartan {
    public SpartanIII(String nombre,int salud,String arma, int escudo) {
        super(nombre,salud,arma,escudo);
    }
    public void camuflajeActivo(){
        System.out.println("El Spartan" + nombre + "cuenta con camuflaje para invisibilidad");
}
}