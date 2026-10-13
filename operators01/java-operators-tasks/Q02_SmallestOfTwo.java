import java.util.Scanner;
public class Q02_SmallestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        String result = (first == second) ? "Same"
                      : (first < second) ? String.valueOf(first)
                      : String.valueOf(second);
        System.out.println(result);
        input.close();
    }
}
