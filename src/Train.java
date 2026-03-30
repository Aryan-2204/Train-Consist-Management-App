import java.util.ArrayList;
import java.util.List;

/**
 * UseCase1TrainConsistApp
 *
 * This class initializes the Train Consist Management Application
 * and displays the initial state of the train.
 *
 * @author Aryan
 * @version 1.0
 */
public class Train {

    /**
     * Entry point of the application
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================");

        // Initialize empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready for further operations.");
    }
}
