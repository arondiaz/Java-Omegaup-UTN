package EstructurasRepetitivas;

import java.util.Scanner;

public class LaSecuenciaInfinita {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        boolean direccion = true;
        int largo = consola.nextInt();
        String acumulador = "";
        int contador = 0;
        int i = 1;

        while(!(contador == largo)){
            if(direccion ){
                acumulador = (i + " ");
                System.out.print(acumulador);
                ++i;

                if(i == 5){
                    direccion = false;
                }

            } else if(!direccion){
                acumulador = (i + " ");
                System.out.print(acumulador);
                --i;
                if(i == 1){
                    direccion = true;
                }
            }
            ++contador;
        }
    }}


