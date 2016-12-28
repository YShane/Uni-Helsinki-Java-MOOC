
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Untl what?");
        int i = 0;
        int cry = 0;
        int number;
        number = Integer.parseInt(reader.nextLine());
        
        while(i <= number)
            //Use the while statement for continuous loops. Be aware of the order of assignment
        {
            cry += i; 
            i++;
           
            
        }
        
        System.out.println(cry);
        

    }
}
