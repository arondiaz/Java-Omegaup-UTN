package EstructurasRepetitivas;

import java.util.Scanner;

public class EncuentraElMayor {

        public static void main(String[] args) {

            Scanner consola = new Scanner(System.in);

            int entero = consola.nextInt();
            if(entero < 0){
                return;
            }
            int mayor = 0;
            for(int i = 0; i < entero; i++){
                int ingreso = consola.nextInt();
                if(ingreso < 0){
                    return;
                }
                if(ingreso > mayor){
                    mayor = ingreso;
                }


            }
            System.out.println(mayor);
        }
    }


