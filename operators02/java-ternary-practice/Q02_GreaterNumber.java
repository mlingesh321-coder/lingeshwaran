import java.util.Scanner;
public class Q02_GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String result = (a > b) ? String.valueOf(a)
                      : (b > a) ? String.valueOf(b) : "Equal";
        System.out.println(result);
        input.close();
    }
}
