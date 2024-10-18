package EstructurasRepetitivas;

import java.util.Scanner;

public class CicloMientrasNoCero {

    public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    int resultado = 0;
    int num;
    do {
    num = consola.nextInt();
    resultado += num;
    } while (num != 0);
    System.out.println(resultado);
      }
    }


