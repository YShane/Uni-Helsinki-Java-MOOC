

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array){
        
        int i = array.length;
        
        int[] array2 = new int[i];
        
        
        for(int x = 0; x< i; x++){
            
            array2[x] = array[x];
            
        }
         return array2;
    }
    
    public static int[] reverseCopy(int[] array){
        
        int i = array.length;
        
        int[] array2 = new int[i];
        
        int j = 0;
        for(int x = i-1; x>-1;x--){
            array2[j] = array[x];
            j++;
        }
        return array2;
    }
   
}
