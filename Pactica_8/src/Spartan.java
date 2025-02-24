public class Spartan {

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    private String name;

    public int getHealth() {
        return health;
    }

    public Spartan(String name, int health, int shield, String maingun) {
        this.name = name;
        this.health = health;
        this.shield = shield;
        this.maingun = maingun;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getMaingun() {
        return maingun;
    }

    public void setMaingun(String maingun) {
        this.maingun = maingun;
    }

    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int shield;
    private String maingun;


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
