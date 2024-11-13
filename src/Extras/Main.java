package Extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long n = 0;

        long max = 1000000000000000L;

        if (a >= 0  && c <= b && b <= max) {
            for(long i = a; i <= b; i++){
                if(i % c == 0){
                    n++;
                }
            }
            System.out.println(n);
        }

    }
}

