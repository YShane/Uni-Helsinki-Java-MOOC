import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //It's always a good idea to create different objects to track different things.
        NumberStatistics x = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        int answer = 0;
        
        while(true){
            System.out.println("Type numbers: ");
            answer = reader.nextInt();
           if(answer != -1){
           x.addNumber(answer);
                if(answer%2==0){
                    even.addNumber(answer);
                }
                else{
                    odd.addNumber(answer);
                }
           }
           else{
           
        System.out.println("Sum: " + x.sum());
        System.out.println("Sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());
            break;
           }   
        
        }              
        
        
        
    }
}