package galgeleg;
import static java.lang.System.in;
import static java.lang.System.out;
import java.rmi.Naming;
import static java.rmi.Naming.lookup;
import java.util.Scanner;

public class BenytGalgelogik {

  public static void main(String[] args) throws Exception {
      
      Scanner scan = new Scanner(in);
      
    GalgeI spil =(GalgeI) lookup("rmi://130.225.170.204:16202/kontotjeneste");  // kører spillet over server RMI
    
  //GalgeI spil =(GalgeI) Naming.lookup("rmi://localhost:1099/kontotjeneste"); kører spillet lokalt med RMI
  //Galgelogik spil = new Galgelogik(); starter spillet lokalt
  
    spil.nulstil();
    
    /*
    System.err.println("Ord fra liste eller DR? ");
      String  = scan.next();
    */
    
    
    /*
    int a = scan.nextInt();
    
    if (a == 1) {
        
          try {
      spil.hentOrdFraDr();
    } catch (Exception e) {
      e.printStackTrace();
    } 
        
    }
    */
      
     
          
      
 
   
    
    
    while (!spil.erSpilletSlut()) {
            out.println("Dit ord er: ");
            out.println(spil.getSynligtOrd());
            out.println("Indtast dit gæt");
        String str = scan.next();
        spil.gætBogstav(str);
        spil.logStatus();
        spil.getSynligtOrd();
            out.println("Antal forkerte bogstaver: " + spil.getAntalForkerteBogstaver());
            out.println("Brugte bogstaver: " + spil.getBrugteBogstaver());
        spil.logStatus();
                
    }
    
    if (spil.erSpilletVundet() == true) {
        spil.erSpilletVundet();
            out.println("Du har vundet!");
            out.println("Dit or var: " + spil.getOrdet());
    } else if (spil.erSpilletTabt() == true) {
        spil.erSpilletTabt();
            out.println("Taber!");
            out.println("Ordet var: " + spil.getOrdet());
    }
    
    
    /*   
    
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());

    spil.gætBogstav("p");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("g");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;
*/
    
  }
}
