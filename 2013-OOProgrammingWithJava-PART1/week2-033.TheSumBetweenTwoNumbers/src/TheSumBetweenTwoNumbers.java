
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int y = 0;
        int first;
        int second;
        
        System.out.println("First Number");
        
        first = Integer.parseInt(reader.nextLine());
        
        
        System.out.println("Second Number");
        
        second = Integer.parseInt(reader.nextLine());
        
        
        if(first> second)
        {
            return;
            
        }
        
        else{
            
            while(first<=second)
            {
                 y +=first; 
                first++;
               
                
               
            }
            System.out.println(y); 
        }
        
    }
}
