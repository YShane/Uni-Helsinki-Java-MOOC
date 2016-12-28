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

public class Plane {
    
    private String id;
    private int capacity;
    private ArrayList<Flight> vols;
    
    public Plane(String ID, int cap){
        
        this.id = ID;
        this.capacity = cap;
        vols = new ArrayList<Flight>();
        
    }
    
    public void addFlight(Flight x){
        
        this.vols.add(x);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Flight> getVols() {
        return vols;
    }

    public void setVols(ArrayList<Flight> vols) {
        this.vols = vols;
    }
    
    @Override
    public String toString(){
        
        return this.getId() + " (" + this.getCapacity() + " ppl)";
        
        
    }
    
    

}
