import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        d = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("dividend: ");
        int a = input.nextInt();
        System.out.println("divider: ");
        int b = input.nextInt();
        while (true) {
            if (a >= b) {
                a = a - b;
                d++;
                // System.out.println(a);
                // System.out.println(d);
            } else if (a == 0) {
                break;
            } else {
                System.out.println(a);
            }
        }
        // d++;
        System.out.println(d);
        // System.out.println("Result: " + (a / b));
    }
}
