package EstructurasRepetitivas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int numero = consola.nextInt();
        int acumulador = 0;

        while (numero > 0 ){
            int ult = (numero % 10) ;
            numero = numero / 10;
            acumulador += ult;
        }

        System.out.println(acumulador);
    }
}
