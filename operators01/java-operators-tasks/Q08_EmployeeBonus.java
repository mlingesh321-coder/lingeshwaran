import java.util.Scanner;
public class Q08_EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int experience = input.nextInt();
        int bonus = (experience >= 5 && salary < 50000) ? 5000 : 0;
        System.out.println(bonus);
        input.close();
    }
}
