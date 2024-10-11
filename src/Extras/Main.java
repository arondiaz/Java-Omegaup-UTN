package Extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int numero = consola.nextInt();

        float[] valores = new float[numero];

        for (int i = 0; i < numero; i++) {
            valores[i] = consola.nextFloat();
        }

        int index = 0;
        float menorValue = valores[0];

        for (int ind = 1; ind < numero; ind++) {

            if (valores[ind] < menorValue) {
                menorValue = valores[ind];
                index = ind;
            }
        }
        System.out.println(index + 1);
        System.out.printf("%.2f%n", menorValue);
    }
}