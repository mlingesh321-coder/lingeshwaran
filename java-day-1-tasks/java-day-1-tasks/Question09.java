import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter department: ");
        String department = input.nextLine();

        System.out.print("Enter percentage: ");
        double percentage = input.nextDouble();

        System.out.println("\nSTUDENT REGISTRATION");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("Percentage: " + percentage);

        input.close();
    }
}
