import java.util.Scanner;

public class Display {

    public static void main(String[] args){

        Scanner name = new Scanner(System.in);

        System.out.println("entrez votre nom");
        String userInput = name.nextLine();
        int stringLength = userInput.length();

        for(int i = 0; i < stringLength; i++){
            char letter = userInput.charAt(i);
            System.out.println(letter);}
        for(int j = 0; j < stringLength; j++){
        }
    }
}