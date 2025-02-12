public class Spartan {

    public String name;
    int health;
    int shield;
    String maingun;

    //metodos del spartan
    public void showInfo(){

        System.out.println("________________________________Spartan infromation");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Shield: " + shield);
        System.out.println("Mingun: " + maingun);
        System.out.println("-----------------------------------------------");
    }
public void attack(String enemy){
        System.out.println( name + " attacks " + enemy + " with " + maingun);

}
public void reloadgun(int ammo){
        int rest = 10;
        int total=rest + ammo;
        System.out.println(" the agun " +  maingun + " contain " + total + " bullets ");
}
public void run(boolean status){
        if(status){
            System.out.println(" The spartan " + name + " is running " );
        }else{
            System.out.println( " The spartan " + name + " stopped ");
        }
}
}
