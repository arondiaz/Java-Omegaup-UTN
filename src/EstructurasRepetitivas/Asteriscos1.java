package EstructurasRepetitivas;

import java.util.Scanner;

public class Asteriscos1 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int N = consola.nextInt();
        int M = consola.nextInt();

        for(int i = 0; i < N; i++){
            for(int c =0; c < M; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
