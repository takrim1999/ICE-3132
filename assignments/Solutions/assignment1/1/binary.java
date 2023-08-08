import java.util.Arrays;
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        int[] arr = new int[40];
        int zeros = 0;
        int ones = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Your Decimal Number: ");
        int num = input.nextInt();
        int i = 0;
        while (num > 0) {
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }
        // System.out.println(arr);
        // Arrays.toSring
        // System.out.println(i);
        // System.out.println(Arrays.toString(arr));
        System.out.println("Binary: ");
        for (int j = i - 1; j >= 0; j--) {
            // System.out.println(j);
            if (arr[j] == 0)
                zeros++;
            else
                ones++;
            System.out.print(arr[j]);
        }
        System.out.println();
        System.out.println("Ones: " + ones);
        System.out.println("Zeros: " + zeros);
    }
}
