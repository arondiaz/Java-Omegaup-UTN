package EstructurasCondicionales;

import java.util.Scanner;

public class TomaDecisiones {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int a = consola.nextInt();
        int b = consola.nextInt();

        if(!(a >= 1 && a <= 100 && b >= 1 && b <= 100)){
            return;
        }

        if( (a + b) == 5){
            b = b + 3;
            int result = (2 * a) + b;
            System.out.println(result);
        } else {
            a = a - 1;
            int ope2 = (7 * a + b);
            if(ope2 % 2 == 0){
                System.out.println(a - b);
            }else{
                System.out.println(a * b);
            }
        }
    }

}
