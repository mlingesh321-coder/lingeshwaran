import java.util.Scanner;
public class Q10_NumberCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = (number == 0) ? "Zero"
                      : (number > 0)
                          ? (number % 2 == 0 ? "Positive Even" : "Positive Odd")
                          : (number % 2 == 0 ? "Negative Even" : "Negative Odd");
        System.out.println(result);
        input.close();
    }
}
