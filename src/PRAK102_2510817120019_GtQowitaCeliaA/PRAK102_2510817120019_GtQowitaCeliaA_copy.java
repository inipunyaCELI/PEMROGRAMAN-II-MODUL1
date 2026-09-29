package PRAK102_2510817120019_GtQowitaCeliaA;

import java.util.Scanner;

public class PRAK102_2510817120019_GtQowitaCeliaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaAwal = scanner.nextInt();
        int counter = 0;

        while (counter < 10) {
            if (angkaAwal % 5 == 0) {
                int hasil = (angkaAwal / 5) - 1;
                System.out.print(hasil);
            } else {
                System.out.print(angkaAwal);
            }

            if (counter < 9) {
                System.out.print(",");
            }
            angkaAwal++;
            counter++;
        }
        scanner.close();
    }
}