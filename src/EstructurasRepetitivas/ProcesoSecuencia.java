package EstructurasRepetitivas;

import java.util.Scanner;

public class ProcesoSecuencia {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int entrada;
        int suma = 0;
        int contador = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int contadorMax = 1;
        int contadorMin = 1;
        while (true) {
            entrada = consola.nextInt();
            if (entrada == -1) break;

            suma += entrada;
            contador++;

            if (entrada > max) {
                max = entrada;
                contadorMax = 1;
            } else if (max == entrada) {
                contadorMax++;
            }


            if (entrada < min) {
                min = entrada;
                contadorMin = 1;
            } else if (min == entrada) {
                contadorMin++;
            }
        }

        consola.close();
        if (contador % 2 == 0) {
            float promedio = (float) suma / contador;
            System.out.printf("%.2f%n", promedio);
            System.out.println(contadorMin);
        } else {
            System.out.println(max - min);
            System.out.println(contadorMax);
        }

    }


}