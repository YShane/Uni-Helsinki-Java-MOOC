
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        Dictionary doc = new Dictionary();
        
        doc.add("Shane", "Wahnsinn");
        doc.add("RET", "Jhj");
        
        TextUserInterface zen = new TextUserInterface(reader, doc);
        zen.start();
        
    }
}
