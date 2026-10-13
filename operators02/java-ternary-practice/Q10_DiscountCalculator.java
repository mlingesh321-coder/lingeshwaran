import java.util.Scanner;
public class Q10_DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        double finalAmount = (amount >= 2000) ? amount * 0.90 : amount;
        System.out.printf("%.2f%n", finalAmount);
        input.close();
    }
}
