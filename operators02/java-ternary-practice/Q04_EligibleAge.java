import java.util.Scanner;
public class Q04_EligibleAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String result = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(result);
        input.close();
    }
}
