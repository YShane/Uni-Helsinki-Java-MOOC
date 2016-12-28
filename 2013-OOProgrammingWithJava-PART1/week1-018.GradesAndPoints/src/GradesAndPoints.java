
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        System.out.println("Type the points [0-60]");
        
        int point = Integer.parseInt(reader.nextLine());
        
        if (point <= 29) {
            
            System.out.println("failed");
        }
        else if (point <=34 && point >= 30) {
            
            System.out.println("1");
        }   
            
        else if (point <= 39 && point >= 35) {
            
            System.out.println("2");
        }
        
        else if (point <= 44 && point >= 40) {
            
            System.out.println("3");
        }
        
        else if (point <= 49 && point >= 45) {
            
            System.out.println("4");
        }
        
        else if (point <= 60 && point >= 50) {
            
            System.out.println("5");
        }
    }
}
