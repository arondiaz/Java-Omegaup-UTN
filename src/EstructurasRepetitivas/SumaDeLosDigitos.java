package EstructurasRepetitivas;

import java.util.Scanner;

public class SumaDeLosDigitos {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int numero = consola.nextInt();
        int acumulador = 0;

        while (numero > 0 ){
            //extrae el ultimo numero
            int ult = (numero % 10) ;
            //saca el numero extraido
            numero = numero / 10;
            //el numero extraido se suma
            acumulador += ult;
        }

        System.out.println(acumulador);
    }

}
