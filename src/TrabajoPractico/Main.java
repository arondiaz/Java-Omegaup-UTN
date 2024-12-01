package TrabajoPractico;
import java.util.Scanner;

public class Main {
    public static double calcularPuntuacionGeneral ( double p, double cp, int nr){
        double puntuacionGeneral = (0.5 * (100/p)) + (0.3 * cp) + (0.2 * Math.log10(nr + 1));
        return puntuacionGeneral;
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numeroGimnasios = consola.nextInt();

        double mejorPuntuacion = -1;
        int mejorGimnasio = 1;

        for (int i = 1; i <= numeroGimnasios; i++) {
            double precio = consola.nextDouble();
            double calificacionPromedio = consola.nextDouble();
            int numeroReviews = consola.nextInt();
            double resultado = calcularPuntuacionGeneral(precio, calificacionPromedio, numeroReviews);
            if (resultado > mejorPuntuacion ) {
                mejorPuntuacion = resultado;
                mejorGimnasio = i;
            }
        }
        System.out.println(mejorGimnasio);
    }
}






