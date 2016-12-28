import java.util.*;
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
   //Just initialise the amountOfNumbers variable so that every object starts off with a 0.
        amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        
        
        
        
        sum = sum + number;
      amountOfNumbers =  amountOfNumbers +1;
        

    }

    public int amountOfNumbers() {
        
        return this.amountOfNumbers; 

    }
    
    public  int sum(){
        
        return sum;
    }
        
    public double average(){
        double res = 0;
        if(amountOfNumbers > 0){
        res = (double)sum/amountOfNumbers;
        }
        else{
            res = 0;
        }
        return res;
    }
    public String toString() {
   return "Amount " + amountOfNumbers;

    }
}
