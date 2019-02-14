/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galgeleg;
import java.rmi.Naming;

/**
 *
 * @author Casper
 */
public class GalgeServer {
    
    public static void main(String[] args) throws Exception {
        
        
    java.rmi.registry.LocateRegistry.createRegistry(1099); // start i server-JVM

		GalgeI g = new Galgelogik();
		Naming.rebind("rmi://localhost:1099/kontotjeneste", g);
		System.out.println("Kontotjeneste registreret.");
       
        
        
        
    }
    
    
    
    
    
    
}
