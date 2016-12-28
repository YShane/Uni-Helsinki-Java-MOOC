
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        
        HashMap<String, String> shane = new HashMap<String, String>();
        
        shane.put("matti", "mage");
        shane.put("mikael", "mixu");
        shane.put("arto", "arppa");
        
        System.out.println(shane.get("mikael"));
    }

}
