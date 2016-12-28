
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
public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();

    private final int weightLimit;

    public Suitcase(int weightLimit) {

        this.weightLimit = weightLimit;

    }

    public void addThing(Thing thing) {

        if (thingsweight() + thing.getWeight() <= this.weightLimit) {
            things.add(thing);

        }
    }

    public void printThings() {

        for (Thing x : things) {

            System.out.println(x);
        }

    }

    public int totalWeight() {
        int ans = 0;

        for (Thing x : things) {
            ans = ans + x.getWeight();
        }
        return ans;
    }

    public Thing heaviestThing() {

        if (things.size() == 0) {
            return null;
        } else {
            Thing ans = things.get(0);
            for (int i = 1; i < things.size(); i++) {

                if (things.get(i).getWeight() > ans.getWeight()) {

                    ans = things.get(i);
                }

            }

            return ans;
        }
    }

    private int thingsweight() {

        int w = 0;
        for (Thing x : this.things) {
            w = w + x.getWeight();

        }
        return w;
    }

    @Override
    public String toString() {

        if (things.size() == 0) {
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + thingsweight() + " kg)";
        } else {
            return things.size() + " things (" + thingsweight() + " kg)";
        }
    }

}
