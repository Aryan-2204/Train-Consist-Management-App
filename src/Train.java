import java.util.*;

class Train {

    // ---------------- BINARY SEARCH METHOD ----------------
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2; // safer mid calculation

            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                return true; // Found
            } 
            else if (cmp < 0) {
                low = mid + 1; // search right
            } 
            else {
                high = mid - 1; // search left
            }
        }

        return false; // Not found
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        // Input
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // 🔥 Handle empty array safely
        if (bogieIds.length == 0) {
            System.out.println("❌ No bogies available. Search failed.");
            sc.close();
            return;
        }

        // 🔥 Ensure sorted before binary search
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Search input
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = binarySearch(bogieIds, key);

        // Output
        if (found) {
            System.out.println("✅ Bogie ID FOUND.");
        } else {
            System.out.println("❌ Bogie ID NOT FOUND.");
        }

        sc.close();
    }
}