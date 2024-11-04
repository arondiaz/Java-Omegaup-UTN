package EstructurasCondicionales;

import java.util.Scanner;

public class IntercambiosMinimos {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        final int MAX = 1000000;
        final int MIN = 0;
        int n1 = consola.nextInt();
        int n2 = consola.nextInt();
        int n3 = consola.nextInt();

        if(n1 >= MIN && n1 <= MAX && n2 >= MIN && n2 <= MAX && n3 >= MIN && n3 <= MAX ){
            if(n1 <= n2 && n2 <= n3){
                System.out.println(0);
            }else if(n1 <= n3 && n1 >= n2 || n3 <= n2 && n1 <= n3 || n1 >= n2 && n2 >= n3){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
    }
}
