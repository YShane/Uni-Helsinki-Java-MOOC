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

public class Bird {
    
    private String name;
    private String latinName;
    private int seen;
    
    
    public Bird(String nomGi, String latGi){
        
        this.name = nomGi;
        this.latinName = latGi;
        this.seen = 0;
        
    }
    
   /* public Bird makeBird(String nomG, String latinG){
        this.name = nomG;
        this.latinName = latinG;
        this.seen = 0;
        
        return
                          
    }*/
    
    public String getName(){
        
        return this.name;
        
    }
    public String getlatName(){
        
        return this.latinName;
    }
    
    public void observeBird(){
        
        seen ++;
    }
    
    public int getObservations(){
        
        return this.seen;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.seen + " observations";
    }
            
}
