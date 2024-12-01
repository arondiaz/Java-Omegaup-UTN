package EjercicioClases;

import java.util.Random;

public class OperacionesArreglos {

    public static void main(String[] args) {

        final int N = 100;
        int [] A = new int[N];
        int tamLogico = N;

        llenarArreglo(A, tamLogico);

        imprimirArreglo(A, tamLogico);
    }

    private static void llenarArreglo(int[] A, int tamLogico){
        Random rnd = new Random();

        for(int i = 0; i < tamLogico; i++){
            A[i] = rnd.nextInt(150);
        }
    }

    private static void imprimirArreglo(int [] A, int tamLogico){
        for(int i = 0; i < tamLogico; i++){
            System.out.println("Posicion "+ i +" "+ A[i]);
        }
    }
}
