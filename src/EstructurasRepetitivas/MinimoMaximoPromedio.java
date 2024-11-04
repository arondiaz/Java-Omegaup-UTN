package EstructurasRepetitivas;

import java.util.Scanner;

public class MinimoMaximoPromedio {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        double N = consola.nextInt();
        int sumPromedio = 0;
        int min = 100;
        int max = -100;


        for(int i = 0; i < N;){

            int num =consola.nextInt();
            sumPromedio += num;

            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
            i++;
        }

        double promedio = sumPromedio / N;
        System.out.printf("%d %d %.2f", min, max, promedio);

    }
}
