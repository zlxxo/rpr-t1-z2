package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int n) {
        if(n < 0)  n *= -1;
        int suma = 0;
        while(n != 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite prirodan broj n: ");
        int n = scanner.nextInt();

        while(n < 1) {
            System.out.print("Unesite prirodan broj n: ");
            n = scanner.nextInt();
        }

        System.out.println("Brojevi od 1 do " + n + " djeljivi sa sumom svojih cifara su:");

        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
