package EstructurasCondicionales;

import java.util.Scanner;

public class DetectandoOrden {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num = consola.nextInt();
        int num2 = consola.nextInt();
        int num3 = consola.nextInt();

        if(!(num >= -100 && num <= 100 && num2 >= -100 && num2 <= 100 && num3 >= -100 && num3 <= 100)){
            return;
        }

        if (num == num2 && num == num3) {
            System.out.println("I");
        }else if(num <= num2 && num2 <= num3 ){
            System.out.println("C");
        }else if(num >= num2 &&  num2 >= num3){
            System.out.println("D");
        } else{
            System.out.println("X");
        }
    }
}
