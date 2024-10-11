package EstructurasCondicionales;

import java.util.Scanner;

public class CalculosCondicionales {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num = consola.nextInt();
        int modificado = 0;

        if(!(num >= 1 && num <= 1000 )){
            return;
        }

        if(num % 2 == 0){
            num = num / 2;
            modificado++;
        }else{
            num = ++num;
            modificado++;
        }

        if(num >= 10 && num <= 99){
            num = num / 10;
            modificado++;
        }else if(num <= 9 && num >= 0){
            num = num;
        }else{
            num = num / 100;
            modificado++;
        }

        if(num % 3 == 0){
            num = --num;
            modificado++;
        }

        System.out.println(num + " " + modificado);
    }
}
