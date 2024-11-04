package EstructurasCondicionales;

import java.util.Scanner;

public class TomaDecisiones {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int a = consola.nextInt();
        int b = consola.nextInt();

        if( a + b == 5){
            b += 3;
            System.out.println((2*a)+b);
        } else {
            a--;
            if((7*a + b) % 2 == 0 ){
                System.out.println(a - b);
            }else{
                System.out.println(a * b);
            }
        }
    }
}
