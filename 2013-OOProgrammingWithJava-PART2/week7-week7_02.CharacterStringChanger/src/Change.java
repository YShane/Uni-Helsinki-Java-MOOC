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

public class Change {
    
    private char fromChar;
    private char toChar;
    
    
    public Change(char fromCharacter, char toCharacter){
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
        
        
    }
    
    
    public String change(String characterString){
        
       String mot =  characterString;
       
     mot =  mot.replace(this.fromChar, this.toChar);
     
     return mot;
    }
}
