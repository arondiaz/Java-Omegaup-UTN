package EstructurasRepetitivas;

import java.util.Scanner;

public class SumandoTerminosDeUnaSeriePeriodica {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int N = consola.nextInt();
        int bloques = N/3;
        int resto = N%3;
        int suma = bloques * 6;

        if(resto == 0){
            System.out.println(suma);
        }else if(resto == 1){
            System.out.println(++suma );
        }else{
            System.out.println(suma += 3);
        }

    }
}