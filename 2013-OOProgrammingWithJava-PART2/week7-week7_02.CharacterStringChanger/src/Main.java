
public class Main {

    public static void main(String[] args) {
        // Test your program here
        /*Change n = new Change('a', 'b');
        
         System.out.println(n.change("Abra"));*/

        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}

