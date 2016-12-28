import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String word = reader.nextLine();
        System.out.println("Last character:" + lastCharacter(word));
    }
    
    
    public static char lastCharacter(String word)
    {
        int i;
        i = word.length();
        return word.charAt(i-1);
    }
}
