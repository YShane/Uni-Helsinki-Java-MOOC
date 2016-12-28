import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String it = reverse(text);
        if(text.equals(it)){
            return true;
        }
        
        return false;
        
    }

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
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
