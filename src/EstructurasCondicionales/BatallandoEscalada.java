package EstructurasCondicionales;

import java.util.Scanner;

public class BatallandoEscalada {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int a = consola.nextInt();
        int b = consola.nextInt();
        int c = consola.nextInt();

        if(a < b && b < c){
            System.out.println("Ascenso");
        } else if (a > b && b > c) {
            System.out.println("Descenso");
        } else if (a < b && b > c) {
            System.out.println("Pico");
        }else {
            System.out.println("Abismo");
        }
    }
}
