import java.util.*;
import java.util.stream.*;

class Train {

    // Passenger Bogie class (for capacity filtering)
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        // Create sample dataset (large dataset simulation)
        for (int i = 0; i < 100000; i++) {
            bogies.add(new PassengerBogie("Sleeper", (i % 100) + 1));
        }

        // ---------------- LOOP-BASED FILTERING ----------------
        long loopStart = System.nanoTime();

        List<PassengerBogie> loopResult = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ---------------- STREAM-BASED FILTERING ----------------
        long streamStart = System.nanoTime();

        List<PassengerBogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // ---------------- RESULTS ----------------
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // Verify both results match
        if (loopResult.size() == streamResult.size()) {
            System.out.println("\n✅ Both approaches produce SAME results");
        } else {
            System.out.println("\n❌ Results mismatch!");
        }
    }
}