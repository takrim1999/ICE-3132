import java.util.Scanner;
import java.util.String;
import java.lang.reflect.Array;
// import java.util.Array;
// import java.util.Arrays;

public class digiSum {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Number:");
        String number = input.next();
        while (Array.getLength(number.toCharArray()) > 1) {
            for (int i = Array.getLength(number.toCharArray()) - 1; i >= 0; i--) {
                total = total + (number.toCharArray()[i] - '0');
                // System.out.println(total);
            }
            System.out.println(number);
            number = String.valueOf(total);

        }
        System.out.println(total);
    }
}
