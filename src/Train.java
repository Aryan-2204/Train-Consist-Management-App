import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UseCase9TrainConsistApp
 *
 * This class demonstrates grouping bogies by type
 * using Collectors.groupingBy().
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

public class Train {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Create bogie list (with duplicates for grouping)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 60));

        // Display original list
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Display grouped result
        System.out.println("\nGrouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nGrouping completed successfully.");
    }
}