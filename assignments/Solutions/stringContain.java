import java.util.Scanner;

public class stringContain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first string: ");
        String str1 = input.nextLine();
        System.out.print("Input second string: ");
        String str2 = input.nextLine();
        System.out.println("If the second string contains the first one? " + (str1.contains(str2) ? "YES" : "NO"));
    }

}
