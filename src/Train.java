import java.util.*;

class Train {

    // ---------------- SEARCH METHOD WITH VALIDATION ----------------
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔥 Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train for search.");
        }

        // Linear Search (can be replaced with Binary Search if sorted)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        // Input bogie IDs
        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = sc.nextLine();
            }
        }

        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("✅ Bogie ID FOUND.");
            } else {
                System.out.println("❌ Bogie ID NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            // Handle fail-fast exception
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}