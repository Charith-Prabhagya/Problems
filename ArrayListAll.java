import java.util.ArrayList;
import java.util.Collections; //Import the Collections class

public class ArrayListAll {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tata");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
        System.out.println(cars.get(2)); // Access an Item

        System.out.println();
        cars.set(3, "Ferari"); // Change an Item

        System.out.println();
        cars.remove(0); // Remove an Item

        // cars.clear();
        // To remove all the elements in the ArrayList

        // cars.size();
        System.out.println();
        System.out.println("sort the arraylist");
        Collections.sort(cars); // Sort cars

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
