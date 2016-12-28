
import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name");
        String word1 = reader.nextLine();
        System.out.println("First character: " + firstCharacter(word1));
    }

    public static char firstCharacter(String word1) {
        
       return word1.charAt(0);
        

    }
}
