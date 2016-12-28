import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam
 */
public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maximumSize = 16;
    

    public Team(String teamName) {
        this.name = teamName;
        players  = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player joueur){
        
        if(this.size()<this.maximumSize)
        this.players.add(joueur);
    }
    
    public void printPlayers(){
        
        for(Player x : this.players){
            System.out.println(x);  
        }
        
    }
    
    public void setMaxSize(int maxSize){
        this.maximumSize = maxSize;
    }
    
    public int size(){
       int zahl = 0;
       for(Player x:players){
           zahl++;
       }
      return zahl;  
    }
    
    public int goals(){
        
        int tor = 0;
        for(Player x:players){
            tor+=x.goals();
        }
        return tor;
    }

}
