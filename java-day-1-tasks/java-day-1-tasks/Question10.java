import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customer = input.nextLine();

        System.out.print("Enter movie name: ");
        String movie = input.nextLine();

        System.out.print("Enter ticket count: ");
        int tickets = input.nextInt();

        System.out.print("Enter ticket price: ");
        double ticketPrice = input.nextDouble();

        System.out.println("\nBOOKING SUMMARY");
        System.out.println("Customer: " + customer);
        System.out.println("Movie: " + movie);
        System.out.println("Tickets: " + tickets);
        System.out.println("Ticket Price: " + ticketPrice);

        input.close();
    }
}
