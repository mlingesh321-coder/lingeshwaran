import java.util.Scanner;
public class Q08_StudentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark1 = input.nextInt();
        int mark2 = input.nextInt();
        int mark3 = input.nextInt();
        String result = (mark1 >= 35 && mark2 >= 35 && mark3 >= 35)
                      ? "Pass" : "Fail";
        System.out.println(result);
        input.close();
    }
}
