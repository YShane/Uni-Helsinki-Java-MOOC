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

public class BirdDatabase {
    
    private ArrayList<Bird> birdList;
    
    public BirdDatabase(){
        
        birdList = new ArrayList<Bird>();
    }
    
    
    
    public void addBird(Bird birdie){
        
      birdList.add(birdie);
    }
    
    
    
    public void findandObserveBird(String see){
        int buf = 0;
        for (Bird x: birdList){
            if(x.getName().equals(see)){
                x.observeBird();
                buf++;
            }
            
            
        }
        if(buf==0){
              System.out.println("Is not a bird!");  
            }
    }
    
    
    
    public void findAndShowBird(String hi){
       int buf = 0;
       for (Bird x: birdList){
            if(x.getName().equals(hi)){
                System.out.println(x);
                buf++;
            }
            
            
        } 
       if(buf ==0){
           System.out.println("Is not a bird!");
       }
    }
    
    
    public void takeAndPassScanner(Scanner reader){
        
        
        while(true){
            
            System.out.println("?");
            String command = reader.nextLine();
            
            if(command.toUpperCase().equals("ADD")){
                System.out.println("Name:");
                String nom = reader.nextLine();
                System.out.println("Latin Name:");
                String latin = reader.nextLine();
                
                Bird birdie = new Bird(nom, latin);
                
                this.addBird(birdie);
                
            }
            
            else if(command.toUpperCase().equals("OBSERVATION")){
                
                System.out.println("What was observed?");
                String vu = reader.nextLine();
                this.findandObserveBird(vu);
                
                
            }
            else if(command.toUpperCase().equals("STATISTICS")){
                this.printStats();
                
            }
            
            else if(command.toUpperCase().equals("SHOW")){
                System.out.println("What?");
                String tu = reader.nextLine();
                this.findAndShowBird(tu);
            }
            
            else if(command.toUpperCase().equals("QUIT")){
                
                break;
            }
            else{
                System.out.println("Do not understand Command");
            }
            
        }
        
    }
    
   
    
    
    public void printStats(){
        
        for(Bird z:birdList){
            System.out.println(z.getName() + " (" + z.getlatName() + "): " + z.getObservations() + " obervations");
        }
    }

}
