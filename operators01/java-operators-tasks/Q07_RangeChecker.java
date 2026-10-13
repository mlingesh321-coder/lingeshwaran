import java.util.Scanner;
public class Q07_RangeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = (number >= 50 && number <= 100)
                      ? "Inside Range" : "Outside Range";
        System.out.println(result);
        input.close();
    }
}
