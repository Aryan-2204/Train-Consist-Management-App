import java.util.*;

class Train {

    // ---------------- CUSTOM EXCEPTION ----------------
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---------------- PASSENGER BOGIE ----------------
    static class PassengerBogie {
        String type;
        int capacity;

        // Constructor with validation
        PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<PassengerBogie> bogies = new ArrayList<>();

        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline

            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Type (Sleeper/AC Chair/First Class): ");
            String type = sc.nextLine();

            System.out.print("Capacity: ");
            int capacity = sc.nextInt();

            try {
                // Attempt to create bogie
                PassengerBogie bogie = new PassengerBogie(type, capacity);
                bogies.add(bogie);

                System.out.println("✅ Bogie added successfully.");

            } catch (InvalidCapacityException e) {
                // Handle invalid capacity
                System.out.println("❌ Error: " + e.getMessage());
                System.out.println("Bogie NOT added.");
            }
        }

        // Display valid bogies
        System.out.println("\n--- Valid Passenger Bogies ---");
        for (PassengerBogie b : bogies) {
            System.out.println("Type: " + b.getType() + ", Capacity: " + b.getCapacity());
        }

        sc.close();
    }
}