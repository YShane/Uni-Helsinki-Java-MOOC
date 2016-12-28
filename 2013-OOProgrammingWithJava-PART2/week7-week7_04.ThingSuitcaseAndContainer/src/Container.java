
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shane Yankam Shaneyankam.com Samyyankam@gmail.com
 */
public class Container {

    private final int maxWeight;

    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int maxW) {

        this.maxWeight = maxW;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (this.containerWeight() + suitcase.totalWeight() <= this.getMaxWeight()) {

            suitcases.add(suitcase);
        } else {

        }
    }

    public void printThings() {

        for (Suitcase x : suitcases) {
            
            x.printThings();

        }
    }

    
    
    private int containerWeight() {

        int w = 0;

        if (this.suitcases.size() > 0) {

            for (Suitcase x : this.suitcases) {

                w = w + x.totalWeight();
            }
        } else {

        }
        return w;

    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "empty (0 kg)";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suitcaes (" + containerWeight() + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + containerWeight() + " kg)";
        }

    }

}
