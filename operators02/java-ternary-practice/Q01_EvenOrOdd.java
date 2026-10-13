import java.util.Scanner;
public class Q01_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        input.close();
    }
}
