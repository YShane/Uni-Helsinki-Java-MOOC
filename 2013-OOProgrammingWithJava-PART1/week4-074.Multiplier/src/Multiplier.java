/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam
 */
public class Multiplier {
    
    private int zahl;
    
    public Multiplier(int number){
        this.zahl = number;
        
        
    }

    public int multiply(int otherNumber){
        
        int result;
        result = otherNumber*zahl;
        return result;
        
    }
}
