import java.util.Scanner;
public class Q07_LastDigitEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = (Math.abs(number % 10) % 2 == 0) ? "Yes" : "No";
        System.out.println(result);
        input.close();
    }
}
