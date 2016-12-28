import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int x= 0;
        int number = 0;
        int y = 0;
        int even = 0;
        int odd = 0;
        while(number != -1)
        {
            System.out.println("Type numbers");
            
            number = Integer.parseInt(reader.nextLine());
            
            if(number != -1)
            {
            x += number;
            y++;
            
            if(number%2 == 0)
             {
                even++;
             }
            else {
                odd++;
            }
            }
        }
        
        {
        System.out.println("Thank you and see you later");
             System.out.println("The Sum is " + x);   
             System.out.println("How many numbers " + y);
             double a = (double)x/y;
             System.out.println("Average:" + a);
             System.out.println("Even numbers:" + even);
             System.out.println("Odd numbers:" + odd);
        }
            
    }
}
/*
MODEL SOLUTION: 

import java.util.Scanner;
 
public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
         
        Scanner reader = new Scanner(System.in);
 
        int sum = 0;
        int numbers = 0;
        int even = 0;
         
        System.out.println("Type numbers:");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
             
            sum += number;
            numbers++;
            if (number % 2 == 0) {
                even++;
            }
        }
 
        double average = (double) sum / numbers;
        int odd = numbers - even;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
*/