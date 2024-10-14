package Extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);

    System.out.println("Numero de compras a realizar");
    int numeroCompras = consola.nextInt();

    for(int i = 0; i < numeroCompras; i++){
        System.out.println("Ingrese el precio de la compra");
        int precio = consola.nextInt();
        System.out.println("Ingrese cartera G o P");
        var cartera = consola.next();
        System.out.println("Ingrese B o M para el negocio");
        var negocio = consola.next();
        System.out.println("T o M para tarjeta o modo");
        var tarjeta = consola.next();
        System.out.println("1 o 3 para las cuotas");
        int cuotas = consola.nextInt();
        double reintegro = 0;
        int transacciones = 1;
        double totalPagado = precio;


        // Calcular el reintegro según el método de pago
        if (tarjeta.equals("T")) {  // Pago con tarjeta
            if (cartera.equals("G")) {
                reintegro = Math.min(precio * 0.25, 4000);  // Cartera General
            } else if (cartera.equals("P")) {
                reintegro = Math.min(precio * 0.40, 6000);  // Cartera Premium
            }
        } else if (tarjeta.equals("M")) {  // Pago con Modo
            reintegro = Math.min(precio * 0.20, 2000);  // Tope de 2000 para Modo

            // Calcular transacciones necesarias sin Math.ceil
            transacciones = precio / 2000;  // Obtener número entero de transacciones
            if (precio % 2000 != 0) {  // Si hay un residuo, se necesita una transacción más
                transacciones++;
            }
        }

        // Calcular el número de transacciones si el comercio es Buena Onda
        if (negocio.equals("B")) {
            if (tarjeta.equals("T")) {  // Solo ajustar las transacciones si es con tarjeta
                if (cartera.equals("G")) {
                    transacciones = precio / 4000;  // Para General
                    if (precio % 4000 != 0) {  // Si hay un residuo, se necesita una transacción más
                        transacciones++;
                    }
                } else if (cartera.equals("P")) {
                    transacciones = precio / 6000;  // Para Premium
                    if (precio % 6000 != 0) {  // Si hay un residuo, se necesita una transacción más
                        transacciones++;
                    }

                }
            }
        }}}    }