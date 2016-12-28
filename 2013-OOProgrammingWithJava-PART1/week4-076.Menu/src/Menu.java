
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal){
        
        if(meals.contains(meal)){
            
        }
        else{
            meals.add(meal);
        }
    }
    public void printMeals(){
        
        for(String c : meals){
            
            System.out.println(c);
        }
    }
    
    public void clearMenu(){
        
        meals.clear();
    }
    // add the methods here
}
