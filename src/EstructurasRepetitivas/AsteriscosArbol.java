package EstructurasRepetitivas;

import java.util.Scanner;

public class AsteriscosArbol {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int N = consola.nextInt();

        //bucle para recorrer todas las filas
        for(int f = 0; f < N; f++){

            //bucle para espacios
            for(int e = 0; e < (N - f - 1); e++ ){
                System.out.print(" ");
            }

            //bucle para asteriscos
            for (int a = 0; a < (f * 2) + 1; a++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
