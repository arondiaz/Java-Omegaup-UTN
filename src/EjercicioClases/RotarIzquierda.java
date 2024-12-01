package EjercicioClases;

import java.util.Random;

public class RotarIzquierda {

        public static void main(String[] args) {

            final int tamFisico = 5;
            int [] A = new int[tamFisico];
            int tamLogico = tamFisico;

            System.out.println("Normal");
            llenarArreglo(A, tamLogico);
            imprimirArreglo(A, tamLogico);

            System.out.println("Rotado izquierda");
            rotarIzquierda(A, tamLogico);
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

        private static void rotarIzquierda(int[] A, int tamLogico){
            int primerValor = A[0];
            for(int i = 0; i < tamLogico - 1; i++){
                A[i] = A[i+1];
            }
            A[tamLogico-1] = primerValor;
        }
    }


