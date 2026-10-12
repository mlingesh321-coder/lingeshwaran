import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        input.close();
    }
}
