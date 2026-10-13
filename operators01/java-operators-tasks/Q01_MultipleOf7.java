import java.util.Scanner;
public class Q01_MultipleOf7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = (number % 7 == 0) ? "Lucky" : "Unlucky";
        System.out.println(result);
        input.close();
    }
}
