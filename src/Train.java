import java.util.*;

class Train {

    // ---------------- BUBBLE SORT METHOD ----------------
    public static void bubbleSort(int[] capacities) {

        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        // Input capacities
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(capacities);

        // Display sorted result
        System.out.println("\nSorted Bogie Capacities:");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }

        sc.close();
    }
}