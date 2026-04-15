import java.util.*;

class Train {

    // ---------------- LINEAR SEARCH METHOD ----------------
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // match found → stop early
            }
        }

        return false; // no match found
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("✅ Bogie ID FOUND in the train consist.");
        } else {
            System.out.println("❌ Bogie ID NOT FOUND.");
        }

        sc.close();
    }
}