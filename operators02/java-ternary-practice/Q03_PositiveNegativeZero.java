import java.util.Scanner;
public class Q03_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = (number > 0) ? "Positive"
                      : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);
        input.close();
    }
}
