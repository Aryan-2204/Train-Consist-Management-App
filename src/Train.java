import java.util.Scanner;
import java.util.regex.*;

class Train {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Display results
        if (isTrainValid) {
            System.out.println("✅ Valid Train ID");
        } else {
            System.out.println("❌ Invalid Train ID");
        }

        if (isCargoValid) {
            System.out.println("✅ Valid Cargo Code");
        } else {
            System.out.println("❌ Invalid Cargo Code");
        }

        sc.close();
    }
}
