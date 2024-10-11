package Extras;

import java.util.Arrays;
import java.util.Scanner;

public class NegocioMasBarato2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int numero = consola.nextInt();

        float [] valores = new float[numero];

        for (int i = 0; i < numero; i++ ){
            valores[i] = consola.nextFloat();
        }

        Arrays.sort(valores);

        System.out.printf("%d%n %.2f", numero, valores[0]);
    }
}
