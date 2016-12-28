
public class Reformatory {

    private  int anzWeightsMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person

        anzWeightsMeasured++;
        return person.getWeight();

    }

    public void feed(Person person) {

        int x = person.getWeight();
        x = x + 1;
        person.setWeight(x);
    }

    public int totalWeightsMeasured() {

        return anzWeightsMeasured;

    }

}
