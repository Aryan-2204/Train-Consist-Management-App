import java.util.*;

class Train {

    // ---------------- CUSTOM RUNTIME EXCEPTION ----------------
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---------------- GOODS BOGIE ----------------
    static class GoodsBogie {
        String type;   // Cylindrical / Rectangular
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
    }

    // ---------------- CARGO ASSIGNMENT METHOD ----------------
    public static void assignCargo(GoodsBogie bogie, String cargo) {

        try {
            // Validation rule
            if (bogie.getType().equalsIgnoreCase("Rectangular") &&
                cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException("Petroleum cannot be assigned to Rectangular bogie!");
            }

            // Safe assignment
            bogie.setCargo(cargo);
            System.out.println("✅ Cargo assigned successfully.");

        } catch (CargoSafetyException e) {
            // Handle unsafe assignment
            System.out.println("❌ Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("🔄 Assignment attempt completed.\n");
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // User input for cargo
        System.out.print("Enter cargo for Cylindrical bogie: ");
        String cargo1 = sc.nextLine();

        System.out.print("Enter cargo for Rectangular bogie: ");
        String cargo2 = sc.nextLine();

        // Assign cargo safely
        assignCargo(b1, cargo1);
        assignCargo(b2, cargo2);

        // Display final state
        System.out.println("--- Final Bogie Status ---");
        System.out.println("Cylindrical Bogie Cargo: " + b1.getCargo());
        System.out.println("Rectangular Bogie Cargo: " + b2.getCargo());

        sc.close();
    }
}