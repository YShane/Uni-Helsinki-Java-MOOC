
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        
        int i = text.length();
        int index = i-1;
        String c = "";
        while(index> -1)
        {
            c = c + text.charAt(index);  //Character.toString(char)  or String.valueOf(char) also a possibility
            index--;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
