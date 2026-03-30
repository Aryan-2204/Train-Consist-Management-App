import java.util.HashSet;
import java.util.Set;

/**
 * UseCase3TrainConsistApp
 *
 * This class demonstrates how to enforce uniqueness of bogie IDs
 * using HashSet in the Train Consist Management System.
 *
 * @author Aryan
 * @version 1.0
 */
public class Traingit {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        System.out.println("\nAdding bogie IDs...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempt to add duplicate
        boolean isAdded = bogieIds.add("BG101");

        // Display all bogies
        System.out.println("\nCurrent Bogie IDs:");
        System.out.println(bogieIds);

        // Check duplicate insertion result
        if (!isAdded) {
            System.out.println("\nDuplicate ID detected: BG101 (not added)");
        }

        // Check existence
        System.out.println("\nDoes BG102 exist? " + bogieIds.contains("BG102"));

        // Final count
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}