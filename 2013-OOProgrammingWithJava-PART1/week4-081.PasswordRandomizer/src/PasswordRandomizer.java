import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
    }
//Remember the order of variable declaration and the use of the for loop in randomisation.
    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        
        for(int i = 0;i<this.passwordLength;i++){
        char letter = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
        password += letter;
        }
        return password;
    }
}
