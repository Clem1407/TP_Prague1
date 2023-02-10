import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez saisir les valeurs de 3 entiers sous la forme x y z");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int max = x;

        for (int i=0; i<3; i++) {
            if (max<y){
                max = y;
            }
            if (max<z){
                max = z;
            }

        }
        System.out.println("Le maximum des 3 nombres " + x + "," + y + " et " + z +  " est " + max);
    }
}