package Extras;
import java.util.Scanner;

public class MultiplosDeUnRango {
    public static void main(String[] args) {
            Scanner consola = new Scanner(System.in);
            int A, B, C;

            A = consola.nextInt();
            B = consola.nextInt();
            C = consola.nextInt();

            if (A >= 0 && C > 0 && A <= B) {
                int mulB = B / C;
                int mulA = (A - 1) / C;
                int suma = mulB - mulA;
                System.out.println(suma);
        }
    }
}