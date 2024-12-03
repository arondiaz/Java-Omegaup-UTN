package EjercicioClases;

public class EliminarDuplicadosYContarParesEliminados {

    static int tamLogico = 6;

    public static void main(String[] args) {

        final int tamFisico = 20;
        int[] arreglo = new int[tamFisico];

        System.out.println("Arreglo original: ");
        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);

        System.out.println("Arreglo actualizado");
        int eliminados = eliminarDuplicadosYContarParesEliminados(arreglo);
        mostrarArreglo(arreglo);
        System.out.println("Elementos eliminados " + eliminados);
    }

    public static void mostrarArreglo(int[] arreglo){
        System.out.println("[ ");
        for(int i = 0; i < tamLogico; i++) {
            System.out.println(arreglo[i] + " ");
        }
        System.out.println("]");
    }

    private static void cargarArreglo(int[] arreglo){
        arreglo[0] = 8;
        arreglo[1] = 20;
        arreglo[2] = 20;
        arreglo[3] = 20;
        arreglo[4] = 250;
        arreglo[5] = 300;
    }

    //elimina el elemento y corre a todos una posicion
    private static void eliminar(int[] arreglo, int posicion){

        for(int i = posicion; i < tamLogico -1; i++){
            arreglo[i] = arreglo[i + 1];
        }
        tamLogico--;
    }

    private static int eliminarDuplicadosYContarParesEliminados(int[] arreglo){
       int i = 0;
       int paresEliminados = 0;
       int sumaElimanados = 0;

       while (i < tamLogico - 1){
           if(arreglo[i] == arreglo[i+1]){
               if(arreglo[i] % 2 == 0){
                   paresEliminados++;
               }
               sumaElimanados += arreglo[i];
               eliminar(arreglo, i + 1);
           }else{
               i++;
           }
       }
        System.out.println("Promedio: " + (double) (sumaElimanados/paresEliminados));
       return paresEliminados;
    }
}
