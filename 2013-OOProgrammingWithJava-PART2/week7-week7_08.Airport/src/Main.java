
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Shane Yankam 
 * Shaneyankam.com
 * Samyyankam@gmail.com
 */

public class Main {
    
        public static void main(String[] args) {
        // TODO code application logic here
            
            
            String predef = "1\n" + "Shane\n" + "200\n" + "1\n" + "Bryan\n" + "150\n" + "2\n" + "Shane\n"
                    + "HAN\n" + "SOLO\n" + "Shane\n" + "HAN\n" + "TUR\n";
            Scanner pred = new Scanner(predef);
            Scanner reader = new Scanner(System.in);
            
            
            Airport s = new Airport(reader);
            s.start();
    }
        
    
    
    

}
