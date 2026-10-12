import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = input.nextLine();

        System.out.print("Enter street address: ");
        String address = input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.print("Enter PIN code: ");
        String pinCode = input.nextLine();

        System.out.print("Enter delivery preference (true/false): ");
        boolean deliveryPreference = input.nextBoolean();

        System.out.println("\nDELIVERY DETAILS");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("PIN Code: " + pinCode);
        System.out.println("Delivery Preference: " + deliveryPreference);

        input.close();
    }
}
