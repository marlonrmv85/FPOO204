

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//creamo el objeto = instanciar objeto
        Spartan masterboss = new Spartan("john 117",100,90,"assault rifle");


masterboss.showInfo();
masterboss.attack(  "elite");
masterboss.reloadgun(65);
masterboss.run(true);



masterboss.setName("Ivan Isay");
masterboss.showInfo();
//System.out.println(masterboss.getName());

        }
    }
