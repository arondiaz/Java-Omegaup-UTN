package EstructurasRepetitivas;

import java.util.Scanner;

public class PracticandoCiclos2 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int N = consola.nextInt();
        int A = consola.nextInt();
        int B = consola.nextInt();

        while(N < 100){
           for(int i = 1; i <= N; i++){
               System.out.print( i + " ");
           }
            for(int i = N; i >= 1; ){
                System.out.print(i-- + " ");
            }
            int T = A * N;
            while(N < T){
                N += B;
            }
        }
    }
}
