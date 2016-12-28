
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int i = array.length;
        for(int j = 0;j<i;j++){
            if(j< i-1){
              System.out.print(array[j] + ",");  
            }
            else{
                if(j ==i-1){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
