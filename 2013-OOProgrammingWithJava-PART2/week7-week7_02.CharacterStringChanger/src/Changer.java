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


public class Changer {
    
    private ArrayList<Change> li = new ArrayList<Change>();;
    
    public Changer(){
        
    }
    
    public void addChange(Change change){
        //this.li = new ArrayList<Change>();
        
        this.li.add(change);
        
    }
    
    public String change(String characterString){
        String t = characterString;
        String man = "";
        int l = this.li.size();
        for(int z = 0; z<l;z++){
        t =    li.get(z).change(t);
        }
        return t;
        
    }
    
    

}
