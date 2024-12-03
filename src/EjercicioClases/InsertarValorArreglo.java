package EjercicioClases;

import java.util.Random;

public class InsertarValorArreglo {
    static int tamLogico = 10; //tamaño logico inicial del arraglo
    static final int N = 100; //tamaño maximo del arreglo
    static int[] A = new int[N];

    public static void main(String[] args) {
        System.out.println("Cargar arreglo");
        cargarArreglo(A);

        System.out.println("Imprimir Arreglo");
        imprimirArreglo(A);


        if(insertarFinal(44) == 1){
            System.out.println("Insertar al final");
            imprimirArreglo(A);
        }

        if(insertarPrincipio(44) == 1){
           System.out.println("Insertar al principio");
           imprimirArreglo(A);
        }


        reemplazarIntercalado(A, 44, true);
        System.out.println("Después de reemplazar en posiciones pares:");
        imprimirArreglo(A);

        // Reemplazar todas las posiciones impares con 55
        reemplazarIntercalado(A, 55, false);
        System.out.println("Después de reemplazar en posiciones impares:");
        imprimirArreglo(A);
    }


    public static void cargarArreglo(int[] A){
        Random rnd = new Random();

        for(int i = 0; i < tamLogico; i++){
            A[i] = rnd.nextInt(150);
        }
    }

    public static void imprimirArreglo(int[] A){
        for(int i = 0; i < tamLogico; i++){
            System.out.println("A [" + i + "]: " + A[i]);
        }
    }

    public static int insertarFinal(int valor){
        if(tamLogico < N){ // Verifica si hay espacio, si tamaño logico es menor que N hay espacios.
            A[tamLogico] = valor; // Agrega el valor al final
            tamLogico++;  // Incrementa el tamaño lógico
            return 1; // Inserción exitosa
        }else{
            return 0; // No se pudo insertar
        }
    }

    public static int insertarPrincipio(int valor){
        if(tamLogico < N){ // Verifica si hay espacio
            for(int i = tamLogico; i > 0; i--){  // Desplaza elementos hacia la derecha
                A[i] = A[i-1];
            }
            A[0]= valor; // Inserta el valor al principio
            tamLogico++;  // Incrementa el tamaño lógico
            return 1; // Inserción exitosa
        }else{
            return 0;  // No se pudo insertar
        }
    }

    public static void reemplazarIntercalado(int[] A, int valor, boolean enPar) {
        // Determinar el punto de inicio (0 para pares, 1 para impares)
        int inicio;

        if(enPar){
            inicio = 0;
        }else{
            inicio = 1;
        }
        // Reemplazar todas las posiciones indicadas
        for (int i = inicio; i < tamLogico; i += 2) {
            A[i] = valor;
        }
    }

    //Eliminar el ultimo elemento del array - Achicando el tope logico


}
