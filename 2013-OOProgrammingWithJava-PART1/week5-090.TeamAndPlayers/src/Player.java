/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam
 */
public class Player {

    private String name;
    private int goals;
    
    public Player(String givenName){
      this.name = givenName;  
      this.goals = 0;
    }
    
    
    
    public Player(String givenName, int amountOfGoals){
        this.name = givenName;
        this.goals = amountOfGoals;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int goals(){
        return this.goals;
    }
    
    public String toString(){
        
        return "Player: " + this.name + ", goals " +  this.goals;
    }
    
    
    
    
}

