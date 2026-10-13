import java.util.Scanner;
public class Q05_DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = (number % 3 == 0 && number % 5 == 0)
                      ? "Divisible by Both" : "Not Divisible by Both";
        System.out.println(result);
        input.close();
    }
}
