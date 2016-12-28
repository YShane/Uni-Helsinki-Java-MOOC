import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word1 = reader.nextLine();
         int i = word1.length();
         int j = 0;
         while(i> j)
         {
             
             System.out.print(word1.charAt(i-1));
             i--;
         }
         
    }
}
