import java.util.Scanner;
public class Q05_ExactChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        String result = (amount % 10 == 0) ? "Valid Amount" : "Invalid Amount";
        System.out.println(result);
        input.close();
    }
}
