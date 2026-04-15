import java.util.*;

class Train {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie types: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        // Input bogie names
        System.out.println("Enter bogie type names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("\nSorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        sc.close();
    }
}