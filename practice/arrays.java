import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int[] array1 = { 1, 2, 3 };
        // int[] array2 = { 1, 2, 3 };
        Scanner input = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = input.next();
        System.out.println("Welcome to console " + name);
        System.out.println("Your age: ");
        int age = input.nextInt();
        System.out.println("found you are " + age + " years old!");
        // System.out.println(Arrays.equals(array1, array2));
        // for (int i = 0; i < 10; i++) {
        // System.out.println(arr[i]);
        // }
    }
}
