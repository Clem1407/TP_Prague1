
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 42;
        String name = "Hello World";

        System.out.println("First variable (x) : " + x +
                ",\nand second variable (y) : " + name);
        //x = name; Not possible
        //name = x; Not possible
        //Those 2 operation are not possible on their own, you need to call
        //other methods to be able to achieve that

        Newclass aNewClass = new Newclass();

        String hi = "Hello";
        System.out.println("Hi = " + hi);
        String salut = "Hello";
        System.out.println("salut = " + salut);

        System.out.println("Are hi and salut the same object ? => " + (salut == hi));

        String truc = "He";
        System.out.println("truc = " + truc);
        truc += "llo";
        System.out.println("truc (moified)= " + truc);

        System.out.println("Are hi and truc the same object ? => " + (salut == truc));
        System.out.println("Do hi and truc contain the same information ? => " + (salut.equals(truc)));


        String firstName,lastName;

        System.out.println("What's your first name");
        Scanner scan = new Scanner(System.in);
        firstName = scan.nextLine();

        System.out.println("What's your last name");
        lastName = scan.nextLine();

        System.out.println("Hello " + firstName + " " + lastName);
    }


}