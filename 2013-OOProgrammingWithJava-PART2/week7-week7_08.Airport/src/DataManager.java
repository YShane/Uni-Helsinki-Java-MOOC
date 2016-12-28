/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Shane Yankam Shaneyankam.com Samyyankam@gmail.com
 */
public class DataManager {

    private HashMap<String, ArrayList<Flight>> flights;
    private ArrayList<Plane> planes;

    public DataManager() {

        this.flights = new HashMap<String, ArrayList<Flight>>();
        this.planes = new ArrayList<Plane>();
    }

    public void addPlane(Scanner reader) {

        System.out.println("Give plane ID:");
        String id = reader.nextLine();

        System.out.println("Give plane capacity:");
        int capa = reader.nextInt();

        Plane x = new Plane(id, capa);

        if (!planes.contains(x)) {
            this.planes.add(x);
        } else {

        }

    }

    public void addFlight(Scanner reader) {

        System.out.println("Give plane ID:");
        String planeId = reader.nextLine();

        System.out.println("Give departure airport code:");
        String depCO = reader.nextLine();

        System.out.println("Give destination airport code:");
        String desCO = reader.nextLine();

        Flight x = new Flight(planeId, depCO, desCO);

        for (Plane i : planes) {
            if (i.getId().equals(planeId)) {

                i.addFlight(x);
            }

        }

        ArrayList<Flight> h = new ArrayList<Flight>();
        for (Plane j : planes) {

            if (j.getId().equals(planeId)) {

                h = j.getVols();
            }
        }

        flights.put(planeId, h);

    }

    public void printPlanes() {

        for (Plane x : this.planes) {
            System.out.println(x);
        }
    }

    public void printFlights() {

        List<String> ans = new ArrayList<String>(this.flights.keySet());

        for (int u = 0; u < this.flights.size(); u++) {
            
            
            
            ArrayList<Flight> go = this.flights.get(ans.get(u));

            this.printFlightArrayList((go));

        }

    }
    
    
    public void printPlaneInfo(Scanner reader){
        
        System.out.println("Give plane ID:");
        
        String i = reader.nextLine();
        
        for(Plane x: this.planes){
            
            if(x.getId().equals(i)){
                System.out.println(x);
            }
        }
        
        
    }

    private void printFlightArrayList(ArrayList<Flight> fly) {

        if(fly!= null){
        
        for (Flight x : fly) {

            System.out.println(x.getPlaneId() + " (" + this.returnPlane(x.getPlaneId()).getCapacity()
            + " ppl) (" + x.getDepApCode() + "-" + x.getDesApCode() + ")");
        }
        
        }
        else{
            
            System.out.println("Gay");
        }

    }
    
    
    private Plane returnPlane(String name){
        
        Plane ret = null;
        
        for(Plane x: this.planes){
            
            if(x.getId().equals(name)){
                
                ret = x;
            }
            
        }
        
      return ret;  
   
    }

}
