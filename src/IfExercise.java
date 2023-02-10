
import java.util.Scanner;

public class IfExercise {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);

        int myInt = scanner.nextInt();
        int result = 0;
        if (myInt > 0) {
            System.out.println("I'm going to multiply by 2 ");
            result = 2* myInt;
        } else if (myInt < 0) {
            System.out.println("I'm going to divide by 2 ");
            result = myInt/2;

        } else {
            System.out.println("Give me your name");
            String name = scanner.next();
            result =name.length();
            if( result> 7)
                System.out.println("What a long name");
            else
                System.out.println("What a short name");
        }
        System.out.println("Result is : " + result);
    }
}