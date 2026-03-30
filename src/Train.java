import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UseCase7TrainConsistApp
 *
 * This class demonstrates sorting bogies based on capacity
 * using Comparator and custom objects.
 *
 * @author Aryan
 * @version 1.0
 */

// Bogie class (custom object)
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class Train {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display after sorting
        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSorted successfully using Comparator.");
    }
}