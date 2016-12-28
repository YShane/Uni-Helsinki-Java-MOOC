
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        

        while (true) {
            System.out.println("Type a word:");
            String x = reader.nextLine();
            if (words.contains(x)) {
                System.out.println("You typed the following word twice:" + x);
                break;

            } else {
                words.add(x);
                
              

            }
        
        }
        

        
                   
    }
}
