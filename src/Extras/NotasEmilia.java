package Extras;

import java.util.Scanner;

public class NotasEmilia {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int numeroExamenes = consola.nextInt();

        int [] valores = new int[numeroExamenes];

        float suma = 0;

        for (int i = 0; i < numeroExamenes; i++ ){
            valores[i] = consola.nextInt();
        }

        for(int i = 0; i < numeroExamenes; i++){
            suma += valores[i];
        }

        float promedioActual = suma / numeroExamenes;
        float nota =( 6 * (numeroExamenes + 1)) - suma;

        if (nota <= 10 && nota >= 1 ) {
            System.out.println(String.format("%.2f", promedioActual));
            System.out.println(String.format("%.2f", nota));
        }else if( nota > 10 ){
            System.out.println(String.format("%.2f", promedioActual));
            System.out.println("Disculpa Emilia, deberas rendir la materia completa en Diciembre");
        }
    }
    }

