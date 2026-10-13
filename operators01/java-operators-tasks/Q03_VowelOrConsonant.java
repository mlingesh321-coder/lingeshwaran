import java.util.Scanner;
public class Q03_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);
        String result = (letter == 'a' || letter == 'e' || letter == 'i'
                      || letter == 'o' || letter == 'u'
                      || letter == 'A' || letter == 'E' || letter == 'I'
                      || letter == 'O' || letter == 'U')
                      ? "Vowel" : "Consonant";
        System.out.println(result);
        input.close();
    }
}
