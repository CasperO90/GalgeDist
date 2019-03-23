/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galgeleg;
import static java.lang.System.out;
import static java.lang.System.setProperty;
import java.rmi.Naming;
import static java.rmi.Naming.rebind;
import static java.rmi.registry.LocateRegistry.createRegistry;

/**
 *
 * @author Casper
 */
public class GalgeServer {
    
    public static void main(String[] args) throws Exception {
        
        	setProperty("java.rmi.server.hostname", "130.225.170.204");

                createRegistry(16202); // start i server-JVM

		GalgeI g = new Galgelogik();
                rebind("rmi://localhost:16202/kontotjeneste", g);
                out.println("Galge Server Oprettet");
       
        
        
        
    }
    
    
    
    
    
    
}
