import java.util.Scanner;
public class Q09_TriangleValidity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        String result = (a + b > c && a + c > b && b + c > a)
                      ? "Valid Triangle" : "Invalid Triangle";
        System.out.println(result);
        input.close();
    }
}
