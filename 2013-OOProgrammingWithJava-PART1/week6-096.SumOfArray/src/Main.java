
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        // Write code here
        int i = array.length;
        int j = 0;
        int y = 0;
        
        while(y<i){
            j += array[y];
            y++;
        } 
        return j;
    }
}
