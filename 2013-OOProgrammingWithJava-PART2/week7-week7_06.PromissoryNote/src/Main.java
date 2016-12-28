public class Main {
    public static void main(String[] args) {
        // Test your program here
        
        
        PromissoryNote h = new PromissoryNote();
        
        h.setLoan("Shane",  230);
        h.setLoan("Bryan", 34);
        
        System.out.println(h.howMuchIsTheDebt("Brya"));
    }
}
