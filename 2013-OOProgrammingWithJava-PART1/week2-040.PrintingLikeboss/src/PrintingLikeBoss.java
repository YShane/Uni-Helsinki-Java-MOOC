//Didn't make Xmas tree myself. Work on it. 


public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int a= 0;
        while(a<amount)
        {
            System.out.print("*");
            a++;
            
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int b = 0;
        while(b<amount)
        {
            System.out.print(" ");
            b++;
        }
       
    }

    public static void printTriangle(int size) {
        // 40.2
        
        int white;
        int black = 1;
        for(white = size; white> 0;white--)
        {
            int space = white -1; 
            printWhitespaces(space);
            
            printStars(black);
            black++;
        }
        
        
        
    }

    public static void xmasTree(int height) {
        // 40.3
        
        int i = 1;
        while(i<=height)
        {
            printWhitespaces(height-i);
            printStars(2*i-1);
            i++;
        }
       
        i = 2;
    while (--i>=0) {
        printWhitespaces(height - 2);
        printStars(3);
        
    }  
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

       // printStars(10);
        
      //  printTriangle(5);
      //  System.out.println("---");
        xmasTree(4);
        System.out.println("---");
       xmasTree(10);
    }
}

/*
public class PrintingLikeBoss {
 
    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed = printed + 1;
        }
        System.out.println("");
    }
 
    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }
 
    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }
 
    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        while (i <= height) {
            printWhitespaces(height - i);
            printStars(i + (i - 1));
            i++;
        }
 
        // the stand:
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }
 
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
 
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
*/