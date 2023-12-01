import java.util.Scanner;
// import java.util.String;
import java.lang.reflect.Array;
import java.util.Arrays;

public class revstring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Sentence: ");
        String sentence = input.nextLine();
        // sentence = "Hello world";
        // System.out.println(sentence.length());
        // System.out.println(Arrays.toString());
        String[] wordArray = sentence.split(" ");
        System.out.println("Reverse of all words:");
        for (int i = Array.getLength(wordArray) - 1; i >= 0; i--) {
            System.out.print(wordArray[i]);
            System.out.print(" ");
        }
    }

}