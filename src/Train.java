import java.util.ArrayList;
import java.util.List;

/**
 * UseCase10TrainConsistApp
 *
 * This class demonstrates calculating total seating capacity
 * using Stream API with map() and reduce().
 *
 * @author Aryan
 * @version 1.0
 */

// Reusing Bogie class
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

public class Train  {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Display bogies
        System.out.println("\nTrain Bogies:");
        bogies.forEach(System.out::println);

        // Calculate total capacity using map() + reduce()
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())      // Extract capacity
                .reduce(0, Integer::sum);       // Aggregate

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Aggregation (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nAggregation completed successfully.");
    }
}