import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter patient full name: ");
        String name = input.nextLine();

        System.out.print("Enter patient ID: ");
        int patientId = input.nextInt();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter body temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Is the patient admitted? (true/false): ");
        boolean admitted = input.nextBoolean();

        System.out.println("\nPATIENT RECORD");
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("Admitted: " + admitted);

        input.close();
    }
}
