public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times     
        
        for(int i = 0;i<amount;i++)
        {
            System.out.print("*");
           
            
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        int y = 0;
        while(y < sideSize)
        {
          printStars(sideSize);
          y++;
        } 
        
        
        
        // 39.2
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int z = 0;
        while(z < height)
        {
            printStars(width);
            z++;
        }
        
    }

    public static void printTriangle(int size) {
        // 39.4
        
        for(int a = 1;a<=size;a++)
        {
           printStars(a); 
            
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
/*
public class Printing {
 
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times       
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed = printed + 1;
        }
        System.out.println("");
    }
 
    public static void printSquare(int sideSize) {
        // 39.2
        int printed = 0;
        while (printed < sideSize) {
            printStars(sideSize);
            printed = printed + 1;
        }
    }
 
    public static void printRectangle(int width, int height) {
        // 39.3
        int printed = 0;
        while (printed < height) {
            printStars(width);
            printed = printed + 1;
        }
    }
 
    public static void printTriangle(int size) {
        // 39.4
        int row = 1;
        while (row <= size) {
            printStars(row);
            row = row + 1;
        }
    }
 
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first
        // here to see that the printout looks correct
 
        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
 
}

*/