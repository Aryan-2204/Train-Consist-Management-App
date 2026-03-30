import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UseCase5TrainConsistApp
 *
 * This class demonstrates maintaining train formation using
 * LinkedHashSet to ensure both uniqueness and insertion order.
 *
 * @author Aryan
 * @version 1.0
 */
public class UseCase5TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (insertion order maintained)
        System.out.println("\nAdding bogies...");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        System.out.println("\nAttempting to add duplicate bogie: Sleeper");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate bogie ignored: Sleeper");
        }

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        System.out.println("\nTrain sequence preserved with no duplicates.");
    }
}