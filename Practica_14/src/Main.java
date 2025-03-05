public class Main {
    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("John", 100, "Rifle de asalto", 150);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();
        System.out.println("------------------------------------------------");

        SpartanIII NobleSix = new SpartanIII("Maria", 56, "Rifle ", 100);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();
        System.out.println("------------------------------------------------");

        SpartanIV Noble = new SpartanIV("Jessica", 90, "Katana", 77);
    }
}