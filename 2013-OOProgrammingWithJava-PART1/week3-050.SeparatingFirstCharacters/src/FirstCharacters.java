
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        
        String word1 = reader.nextLine();
        
        int i = word1.length();
         if(i < 3)
         {
             
         }
         else {
        
        System.out.println("1. character: " + firstCharacter(word1));
        System.out.println("2. character: " + secondCharacter(word1));
        System.out.println("3. character: " + thirdCharacter(word1));
         }
    }

    public static char firstCharacter(String word1) {
        
        return word1.charAt(0);

    }

    public static char secondCharacter(String word1) {
        return word1.charAt(1);

    }

    public static char thirdCharacter(String word1) {
        return word1.charAt(2);

    }
}
