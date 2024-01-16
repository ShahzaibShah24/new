package lab1and2;
public class FlightBooking {
    private static int availableTickets = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread user = new UserThread("User " + i);
            user.start();
        }
    }

    private static class UserThread extends Thread {
        private String userName;

        public UserThread(String name) {
            this.userName = name;
        }

        public void run() {
            bookTicket(userName);
        }
    }

    // Synchronize the bookTicket method
    private synchronized static void bookTicket(String userName) {
        if (availableTickets > 0) {
            System.out.println(userName + " booked a ticket.");
            availableTickets--;
        } else {
            System.out.println(userName + " could not book a ticket. No more available tickets.");
        }
    }
}