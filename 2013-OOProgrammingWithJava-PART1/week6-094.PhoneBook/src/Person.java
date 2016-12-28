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

public class Person {
    private String name;
    private String number;
    
    
    
    public Person(String nameGiven, String telGiven){
        
        this.name = nameGiven;
        this.number = telGiven;
    }
    
    public void changeNumber(String newNumber){
        this.number = newNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "" + name + " number: " + number;
    }
    
    

}
