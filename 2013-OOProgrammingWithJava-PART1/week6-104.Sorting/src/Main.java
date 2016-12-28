
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write testcode here

    }

    public static int smallest(int[] array) {
        int y = array[0];
        for (int x : array) {
            if (x < y) {
                y = x;
            }

        }
        return y;
    }

    public static int indexOfTheSmallest(int[] array) {
        int y = array[0];
        int counter = -1;
        int spot = 0;

        for (int x : array) {
            counter++;
            if (x < y) {
                y = x;
                spot = counter;

            }

        }
        return spot;

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int length = array.length;

        int buf = index;
        for (int i = index; i < length; i++) {

            if (array[buf] > array[i]) {
                buf = i;
            }
        }
        return buf;
    }

    public static void swap(int[] array, int index1, int index2) {

        int length = array.length;
        int[] give = new int[length];

        int buffer1;
        int buffer2;
        buffer1 = array[index1];
        buffer2 = array[index2];

        array[index1] = buffer2;
        array[index2] = buffer1;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
        }
    }

}
