import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        // System.out.println("Working!");
        Scanner input = new Scanner(System.in);
        System.out.println("Number :");
        int a = input.nextInt();
        System.out.println("Number :");
        int b = input.nextInt();
        int t = a;
        for (int i = b - 1; i > 0; i--) {
            t += a;
            // System.out.println(a);
        }
        System.out.println("Multiplication is :" + t);
    }
}
