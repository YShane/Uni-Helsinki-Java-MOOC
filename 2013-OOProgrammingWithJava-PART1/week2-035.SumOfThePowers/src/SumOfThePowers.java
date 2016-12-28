
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 0;  //power that increases with every while loop
        int n;
        int t= 0;  //sumation of results
        
        System.out.println("Type a number");
        
        n = Integer.parseInt(reader.nextLine());
        
        while(x <= n)
        {
             t += (int)Math.pow(2, x);
           x++;
           
            
        }
        
        System.out.println(t);

    }
}
