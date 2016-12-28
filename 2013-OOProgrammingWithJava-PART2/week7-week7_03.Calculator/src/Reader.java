import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam 
 * Shaneyankam.com
 * Samyyankam@gmail.com
 */

public class Reader {
    
    private Scanner readShit;
    
    public Reader(){
        this.readShit = new Scanner(System.in);
    }
    
    public String readString(){
        
        return readShit.nextLine();
        
    }
    
    public int readInteger(){
        
        return Integer.parseInt(readShit.nextLine());
        
        
    }

}
