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

public class Phonebook {
 
    private  ArrayList<Person> phoneb;
    
    public Phonebook(){
        
        this.phoneb = new ArrayList<Person>();
        
    }
    
    public void add(String name, String number){
        
        Person x = new Person(name, number);
        phoneb.add(x);
    }
    
    public void printAll(){
        
        for (Person x:phoneb){
            
            System.out.println(x); 
        }
    }
    
    public String searchNumber(String name){
        String nom = "";
        int t = 0;
        for(Person x:phoneb){
            if(x.getName()==name){
               t++;
            }
        if(t == 0){
            nom = "number not found";
        }
        else{
            for(Person y:phoneb){
                if(x.getName()== name){
                    nom = x.getNumber();
                }
            }
        }
        
            
        
        
    }
      return nom;  
}

}