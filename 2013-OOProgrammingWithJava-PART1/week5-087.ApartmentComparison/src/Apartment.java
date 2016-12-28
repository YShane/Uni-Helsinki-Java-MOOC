
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment other){
        
        if(this.rooms >other.rooms || this.squareMeters > other.squareMeters){
            return true;
            
        }
        else{
        return false;
        }
        
    }
    
    public int priceDifference(Apartment other){
        
        int x = this.pricePerSquareMeter * this.squareMeters;
        
        int y = other.pricePerSquareMeter * other.squareMeters;
        
        return Math.abs(x-y);
        
    }
    
    public boolean moreExpensiveThan(Apartment other){
        
        int x = this.pricePerSquareMeter * this.squareMeters;
        int y = other.pricePerSquareMeter * other.squareMeters;
        
        if(x>y){
            return true;
        }
        else{
            return false;
        }
    }
    
}
