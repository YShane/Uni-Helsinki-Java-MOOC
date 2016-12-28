import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
       ExamGrades c = new ExamGrades(passScanner(lukija));
        c.printDistribution();
        c.acceptancePercentage();
        
    }
    
    
    public static ArrayList<Double> passScanner(Scanner lukija){
        ArrayList<Double> me = new ArrayList<Double>();
        
        
        
        while(true){
            System.out.println("Input Score");
            double d = lukija.nextDouble();
            if(d!=-1 && d>=0 && d < 61){
               me.add(d);
                
            }
            else if(d==-1){
                break;
            }
            else{
                
            }
        
        }
        
        return me;
        
     //   ExamGrades x = new ExamGrades(me);
      
    }

    
    
}
