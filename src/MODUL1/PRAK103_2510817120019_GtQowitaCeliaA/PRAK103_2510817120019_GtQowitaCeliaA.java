package MODUL1.PRAK103_2510817120019_GtQowitaCeliaA;

import java.util.Scanner;

public class PRAK103_2510817120019_GtQowitaCeliaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int angka = scanner.nextInt();
        int hitung = 0;

        do {
            if (angka % 2 != 0) {
                System.out.print(angka);
                hitung++;
                if (hitung < n) {
                    System.out.print(", ");
                }
            }
            angka++;
        } while (hitung < n);

        scanner.close();
    }
}