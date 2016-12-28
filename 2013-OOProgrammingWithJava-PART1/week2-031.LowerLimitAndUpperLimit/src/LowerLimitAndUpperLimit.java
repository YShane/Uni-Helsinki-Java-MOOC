
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        
        System.out.println("First:");
        
        int first;
        first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second:");
        
        int second;
        second = Integer.parseInt(reader.nextLine());
        
        if(second<first)
        {
            
         return;   
            
        }
        else {
            while(first<=second){
                
                System.out.println(first);
                
                first++;
            }
                
            
        } 

    }
}
