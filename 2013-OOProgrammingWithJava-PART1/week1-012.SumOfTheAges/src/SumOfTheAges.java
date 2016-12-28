
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name:");
        String name1 = reader.nextLine();
        
        System.out.println("Type your age:");
        int age1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String name2 = reader.nextLine();
        
        System.out.println("Type your age:");
        int age2 = Integer.parseInt(reader.nextLine());
        
      
        int cheers = (age1 + age2);
        String names = (name1 + " and " +  name2 + " are " + cheers + " years old in total.");
        
        
        System.out.println(names);
        
    }
}
