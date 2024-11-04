package Extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = 0;


        if(a <= b && c <= b && a >= 0 && c >= 0 && b <= 1000000000000000L){
            for(int i = a; i <= b; i++){
                if(i % c == 0){
                    n++;
                }
            }
            System.out.println(n);
        }

    }
}

