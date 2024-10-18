package Extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definir los topes y porcentaje de reintegro
        final int TOPE_GENERAL = 4000;
        final int TOPE_PREMIUM = 6000;
        final int TOPE_MODO_MENSUAL = 2000;
        final double PORCENTAJE_REINTEGRO = 0.20;

        // Variables para manejar el límite mensual de Modo
        double reintegroModoAcumulado = 0;

        // Leer el número de compras
        System.out.print("Número de compras: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            // Leer los datos de la compra
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Cartera (G para General, P para Premium): ");
            char cartera = scanner.next().charAt(0);

            System.out.print("Comercio (B para Buena Onda, M para Mala Onda): ");
            char negocio = scanner.next().charAt(0);

            System.out.print("Método de pago (T para Tarjeta, M para Modo): ");
            char metodoPago = scanner.next().charAt(0);

            System.out.print("Cuotas (1 o 3): ");
            int cuotas = scanner.nextInt();

            // Determinar el tope de reintegro por transacción
            int topeTransaccion;
            if (metodoPago == 'T') {
                topeTransaccion = (cartera == 'G') ? TOPE_GENERAL : TOPE_PREMIUM;
            } else {  // Modo
                topeTransaccion = TOPE_MODO_MENSUAL - (int) reintegroModoAcumulado;
            }

            // Calcular cuántas transacciones se necesitan si el negocio es Buena Onda
            int transacciones = 1;
            if (negocio == 'B') {
                transacciones = (int) Math.ceil(precio / topeTransaccion);
            }

            // Calcular el reintegro total
            double reintegroTotal = Math.min(precio * PORCENTAJE_REINTEGRO, topeTransaccion);

            // Si el método de pago es Modo, acumulamos el reintegro y revisamos si excede el tope mensual
            if (metodoPago == 'M') {
                if (reintegroModoAcumulado + reintegroTotal > TOPE_MODO_MENSUAL) {
                    reintegroTotal = TOPE_MODO_MENSUAL - reintegroModoAcumulado;
                }
                reintegroModoAcumulado += reintegroTotal;
            }

            // Calcular el monto final
            double montoFinal = precio - reintegroTotal;

            // Si se pagan en 3 cuotas, el reintegro se aplica en el primer resumen
            if (cuotas == 3) {
                reintegroTotal *= 1;  // El reintegro se mantiene igual
            }

            // Mostrar los resultados
            if (negocio == 'B') {
                System.out.println("Transacciones a realizar: " + transacciones);
            }
            System.out.printf("Reintegro total: %.2f\n", reintegroTotal);
            System.out.printf("Monto final: %.2f\n", montoFinal);
        }

        scanner.close();
    }

    }

