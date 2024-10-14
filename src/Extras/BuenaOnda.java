package Extras;

import java.util.Scanner;


public class BuenaOnda {
        public static void main(String[] args) {

            Scanner consola = new Scanner(System.in);

            // Leer el número de compras
            int numeroCompras = consola.nextInt();

            for (int i = 0; i < numeroCompras; i++) {
                // Leer los datos de cada compra
                int precio = consola.nextInt();
                var cartera = consola.next();  // 'G' para General o 'P' para Premium
                var negocio = consola.next();  // 'B' para Buena onda o 'M' para Mala onda
                var metodoPago = consola.next();  // 'T' para Tarjeta o 'M' para Modo
                int cuotas = consola.nextInt();  // Número de cuotas (1 o 3)

                // Variables para el reintegro, número de transacciones y el total pagado
                double reintegro = 0;
                int transacciones = 1;  // Por defecto, al menos 1 transacción
                double totalPagado = precio;

                // Calcular el reintegro según el tipo de cartera
                if (cartera.equals("G")) {
                    reintegro = Math.min(precio * 0.25, 4000);  // Cartera General
                } else if (cartera.equals("P")) {
                    reintegro = Math.min(precio * 0.40, 6000);  // Cartera Premium
                }

                // Si el pago es con Modo, se aplica un reintegro adicional
                if (metodoPago.equals("M")) {
                    double modoReintegro = Math.min(precio * 0.20, 2000);
                    reintegro += modoReintegro;
                }

                // Calcular el número de transacciones si el comercio es Buena Onda
                if (negocio.equals("B")) {
                    if (cartera.equals("G")) {
                        transacciones = (int) Math.ceil(precio / 4000.0);  // Para General
                    } else if (cartera.equals("P")) {
                        transacciones = (int) Math.ceil(precio / 6000.0);  // Para Premium
                    }
                }

                // Calcular el costo final después del reintegro
                totalPagado = precio - reintegro;

                // Mostrar los resultados
                System.out.println("Compra " + (i + 1) + ":");
                if (negocio.equals("B")) {
                    System.out.println("Transacciones necesarias: " + transacciones);
                }
                System.out.printf("Reintegro total: %.2f%n", reintegro);
                System.out.printf("Total pagado: %.2f%n", totalPagado);
            }

            consola.close();  // Cerrar el scanner
        }
    }


