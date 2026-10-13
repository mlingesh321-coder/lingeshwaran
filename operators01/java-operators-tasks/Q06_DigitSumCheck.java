import java.util.Scanner;
public class Q06_DigitSumCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        String result = (firstDigit == secondDigit) ? "Equal Digits" : "Different Digits";
        System.out.println(result);
        input.close();
    }
}
