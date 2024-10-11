package PrimerosProblemas;

import java.util.Scanner;

public class ProgramandoFuncionesRaras {
        public static void main(String[] args) {
            var consola = new Scanner(System.in);

            double x = consola.nextDouble();
            double y = consola.nextDouble();
            double z = consola.nextDouble();
            double pi = Math.PI;

            double operacion = (x + x * (y + Math.pow(z,2)));
            double operacion2 = (x + pi) * (y + pi);
            double resultado = operacion / operacion2;

            System.out.println(resultado);

        }
    }


