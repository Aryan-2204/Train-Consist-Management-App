import java.util.LinkedList;

/**
 * UseCase4TrainConsistApp
 *
 * This class demonstrates maintaining an ordered train consist
 * using LinkedList operations.
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

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies (initial formation)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        // Final state
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nTrain sequence maintained successfully.");
    }
}