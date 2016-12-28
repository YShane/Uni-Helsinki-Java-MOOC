//Didn't do myself. My own worked but course wouldn't accept it.


import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        

        // program your solution here. Do not touch the above lines!
       // int x = 1;
        int i = 0;
          
 
        while (true){
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            if(guess == numberDrawn){
                break;
            } else if (guess < numberDrawn) {
                i++;
                System.out.println("Your number is greater, guesses made: " + i);      
            } else if (guess > numberDrawn) {
                i++;
                System.out.println("Your number is lesser, guesses made: " + i);
            }
        }
        System.out.println("Congratulations, your guess is correct");
}
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
