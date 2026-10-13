import java.util.Scanner;
public class Q09_FreeDelivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        boolean premium = input.nextBoolean();
        String result = (amount >= 1000 || premium)
                      ? "Free Delivery" : "Delivery Charges Apply";
        System.out.println(result);
        input.close();
    }
}
