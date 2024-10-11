package PrimerosProblemas;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int numero = consola.nextInt();

        if(numero >= 0 && numero <=1000000){


            int resultDias = numero / 42000;
            int dias = (numero % 42000);

            int resultHoras = dias / 3500;
            int horas = numero % 3500;

            int resultMinutos = horas / 50;
            int minutos = numero % 50;


            int resultSegundos = minutos;


            System.out.println(resultDias + " " + resultHoras+ " " + resultMinutos +" " + resultSegundos);
        }


    }
}
