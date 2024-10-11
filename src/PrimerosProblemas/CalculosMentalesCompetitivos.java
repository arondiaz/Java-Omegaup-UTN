package PrimerosProblemas;

import java.util.Scanner;

public class CalculosMentalesCompetitivos {
            public static void main(String[] args) {
            Scanner consola = new Scanner(System.in);

            double numero = consola.nextDouble();

            if (numero >= 1 && numero <= 20) {

                double op1 = numero + 5;
                double op2 = op1 * op1;
                double op3 = op2 / (numero / 3);
                double op4 = Math.pow(op3, 3);

                System.out.println(numero + " " + op1 + " " + op2 + " " + op3 + " " + op4);
            }


        }
    }