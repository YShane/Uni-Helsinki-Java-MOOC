import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 1;
        int n;
        int x = 1;
        
        System.out.println("Type a number");
        
        n = Integer.parseInt(reader.nextLine());
        
        if(n == 0)
        {
            System.out.println("1");
            
        }
        else {
            while(i<=n)
            {
                x *= i;
               i++;
               
                
            }
            System.out.println(x);
        }
        
        
        
        
    }
}
