
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = reader.nextLine();
            if (!name.isEmpty()) {
                System.out.println("Student number: ");
                String number = reader.nextLine();
                Student it = new Student(name, number);
                students.add(it);
            } else {
                break;
            }
        } // Use loop control here to break out of while and print the ArrayList. Always use !while
        for (Student x : students) {
            System.out.println(x);
        }
            //Be very careful with loop bracket endings. They can sometimes overlap and cause issues 
            System.out.println("Give search term: ");
            String search = reader.nextLine();
            for (Student y : students) {
                if (y.getName().contains(search)) {
                    System.out.println("Result: " + y);
                }
            }
        }

    }

