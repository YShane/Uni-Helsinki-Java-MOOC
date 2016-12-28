import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int x = 0;
        for(int go : list){
            
            x += go;
        }
       return x;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
            int e = list.size();
        
        
        double average = sum/e;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double math = 0;
        double sub = 0;
        double var = 0;
        double c = average(list);
        for(int d : list){
           sub = (d- c);
           sub = sub*sub;
            math += sub;
        }
      var = math/(list.size()-1);
      return var;
        
    }
    //Did it all myself. really helps with mathematical programming.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
