package EstructurasRepetitivas;

import java.util.Scanner;

public class UnProcesoIterativoSencillo {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int N = consola.nextInt();

        while(N < 100){
            if(N % 2 == 0){
                N = N+3;
            }else {
                N = N *2;
            }
        }

        System.out.println(N);
    }
}

