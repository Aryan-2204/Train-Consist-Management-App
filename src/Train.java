import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UseCase8TrainConsistApp
 *
 * This class demonstrates filtering bogies using Java Stream API
 * based on seating capacity.
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

public class Train{

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Create bogie list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Display original list
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // Filter bogies with capacity > 60 using Stream API
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nFiltering completed using Stream API.");
    }
}