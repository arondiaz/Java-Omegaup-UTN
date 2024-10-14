package EstructurasCondicionales;

import java.util.Scanner;

public class EtapasVida {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int edad = consola.nextInt();

        if(edad < 0 || edad > 99){
            return;
        }

        if(edad >= 0 && edad <= 3){
            System.out.println("BEBE");
        }else if(edad >= 4 && edad <= 14){
            System.out.println("NINO");
        } else if (edad >= 15 && edad <= 18) {
            System.out.println("JOVEN");
        }else if(edad >= 19 && edad <= 65){
            System.out.println("ADULTO");
        }else{
            System.out.println("ADULTO 3RA");
        }

    }
}
