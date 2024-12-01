package EstructurasDeDatos;

import java.util.Scanner;

public class OmitiendoInterseccion {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int N = consola.nextInt();

        int[] primer = new int[N];
        int[] segunda = new int[N];

        for(int i = 0; i < N; i++){
            primer[i] = consola.nextInt();
        }

        for(int i = 0; i <N; i++){
            segunda[i] = consola.nextInt();
        }

        for(int i = 0; i < primer.length; i++){
           for(int k = 0; k < segunda.length; k++){
               System.out.println("Primer" + primer[i]);
               System.out.println("SEgundo" + segunda[k]);
               if(primer[i] != segunda[k]){
                   System.out.println("elemento igual"+  primer[i]);
               }
           }

        }

    }
}
