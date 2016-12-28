
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        
        int number;
        int fat = 1;
        number = Integer.parseInt(reader.nextLine());
        
        while(fat < number +1)
        {
            System.out.println(fat);
            
            fat++;
            
        }
        
        // Write your code here
        
    }
}
