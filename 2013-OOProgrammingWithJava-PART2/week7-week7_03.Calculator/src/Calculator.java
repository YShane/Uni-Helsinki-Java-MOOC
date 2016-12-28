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

public class Calculator {
    
  private  Reader read;
  private int z;
    
    
    public Calculator(){
        
        this.read = new Reader();
        this.z = 0;
    }
    
    public void start(){
        
        while(true){
            
            System.out.println("Type a Command:");
            String command = read.readString();
            if(command.equals("end")){
                break;
            }
            
            if(command.equals("sum")){
               sum(); 
               
                
            }
            else if(command.equals("difference")){
                
               difference(); 
               
            }
            else if(command.equals("product")){
                product();
                
                
            }
            
            
            
        }
        statistics();
        
    }
    
    private void sum(){
        System.out.println("Value1:");
        
        int value1 = this.read.readInteger();
        
        System.out.println("Value2");
        
        int value2 = this.read.readInteger();
        
        System.out.println("sum of the values" + (value1 + value2));
        
        this.z++;
        
    }
    
    private void difference(){
       System.out.println("Value1:");
        
        int value1 = this.read.readInteger();
        
        System.out.println("Value2");
        
        int value2 = this.read.readInteger();
        
        System.out.println("difference of the values" + (value1 - value2)); 
        
        this.z++;
        
    }
    
    private void product(){
        System.out.println("Value1:");
        
        int value1 = this.read.readInteger();
        
        System.out.println("Value2");
        
        int value2 = this.read.readInteger();
        
        System.out.println("product of the values" + (value1 * value2));
        
        this.z++;
        
        
    }
    
    private void statistics(){
       
        System.out.println("Calculations done" + z);
        
    }

}
