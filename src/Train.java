import java.util.LinkedList;
import java.util.Queue;

/**
 * UseCase5BookingRequestQueue
 *
 * This class demonstrates handling booking requests using
 * a Queue (FIFO) to ensure fair processing order.
 *
 * @author Aryan
 * @version 1.0
 */

// Reservation class representing a booking request
class Reservation {
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "Guest: " + guestName + ", Room Type: " + roomType;
    }
}

public class Train{

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=======================================");
        System.out.println("   Hotel Booking Management System");
        System.out.println("=======================================");

        // Create booking request queue (FIFO)
        Queue<Reservation> bookingQueue = new LinkedList<>();

        // Add booking requests (simulate incoming requests)
        System.out.println("\nAdding booking requests...");

        bookingQueue.add(new Reservation("Aryan", "Single Room"));
        bookingQueue.add(new Reservation("Neha", "Double Room"));
        bookingQueue.add(new Reservation("Rahul", "Suite"));

        // Display queue state
        System.out.println("\nCurrent Booking Queue:");
        for (Reservation r : bookingQueue) {
            System.out.println(r);
        }

        // Show next request to be processed (without removing)
        System.out.println("\nNext request to be processed:");
        System.out.println(bookingQueue.peek());

        // Total requests in queue
        System.out.println("\nTotal pending requests: " + bookingQueue.size());

        System.out.println("\nAll requests are stored in arrival order (FIFO).");
        System.out.println("No rooms allocated yet. Ready for next stage...");
    }
}