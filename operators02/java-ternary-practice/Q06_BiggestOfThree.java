import java.util.Scanner;
public class Q06_BiggestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int largest = (a >= b && a >= c) ? a : (b >= c) ? b : c;
        System.out.println(largest);
        input.close();
    }
}
