
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        
        int i = array.length;
        
        for(int x= 0;x<i;x++){
            int star = array[x];
            
            int pri = 0;
            while(pri<star){
                System.out.print("*");
                pri++;
            }
            System.out.print("\n");
        }
    }
}
