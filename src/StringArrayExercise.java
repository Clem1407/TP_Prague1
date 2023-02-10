
import java.util.Arrays;
import java.util.Scanner;

public class StringArrayExercise {
    public static void main(String[] args) {
        String[] words = new String[3];

        System.out.println("Please enter 3 words");
        Scanner scan = new Scanner(System.in);
        words[0] = scan.nextLine();
        words[1] = scan.nextLine();
        words[2] = scan.nextLine();
        System.out.println("Words given by the user");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);


        Arrays.sort(words);

        System.out.println("Words sorted ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
    }
}