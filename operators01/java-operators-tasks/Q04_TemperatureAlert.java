import java.util.Scanner;
public class Q04_TemperatureAlert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();
        String result = (temperature > 35) ? "Hot"
                      : (temperature >= 20) ? "Normal" : "Cold";
        System.out.println(result);
        input.close();
    }
}
