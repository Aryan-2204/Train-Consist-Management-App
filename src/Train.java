import java.util.*;

class Train {

    // Inner class representing Goods Bogie
    static class GoodsBogie {
        String type;   // Cylindrical, Rectangular, Open, Box
        String cargo;  // Petroleum, Coal, Grain, etc.

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<GoodsBogie> bogies = new ArrayList<>();

        System.out.print("Enter number of goods bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // User prepares list of bogies
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Bogie " + (i + 1));

            System.out.print("Type (Cylindrical/Rectangular/Open/Box): ");
            String type = sc.nextLine();

            System.out.print("Cargo: ");
            String cargo = sc.nextLine();

            bogies.add(new GoodsBogie(type, cargo));
        }

        // Stream Safety Validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(bogie ->
                        !bogie.getType().equalsIgnoreCase("Cylindrical") ||
                        bogie.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\n✅ Train is SAFETY COMPLIANT.");
        } else {
            System.out.println("\n❌ Train is NOT SAFE!");
        }

        sc.close();
    }
}
