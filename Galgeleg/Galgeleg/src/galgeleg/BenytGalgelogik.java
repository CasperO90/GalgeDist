package galgeleg;
import java.rmi.Naming;
public class BenytGalgelogik {

  public static void main(String[] args) throws Exception {
      
      
    GalgeI spil =(GalgeI) Naming.lookup("rmi://localhost:1099/kontotjeneste");

    //Galgelogik spil = new Galgelogik();
    spil.nulstil();

    try {
      //spil.hentOrdFraDr();
    } catch (Exception e) {
      e.printStackTrace();
    }
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());

    spil.gætBogstav("e");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());

    spil.gætBogstav("a");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("i");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("s");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("r");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("l");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("b");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("o");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("t");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("n");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("m");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

    spil.gætBogstav("y");
    spil.logStatus();
    System.out.println("xxx " + spil.getAntalForkerteBogstaver());
    System.out.println("yyy " + spil.getSynligtOrd());
    if (spil.erSpilletSlut()) return;

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
  }
}
