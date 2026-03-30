import java.util.HashMap;
import java.util.Map;

/**
 * UseCase6TrainConsistApp
 *
 * This class demonstrates mapping bogies to their capacities
 * using HashMap (key-value pairs).
 *
 * @author Aryan
 * @version 1.0
 */
public class Train {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogies with capacities
        System.out.println("\nAdding bogie capacity details...");

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // Display all entries using entrySet()
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example of fast lookup
        System.out.println("\nCapacity of Sleeper: " + bogieCapacityMap.get("Sleeper"));

        System.out.println("\nSystem ready for analytics and validation...");
    }
}