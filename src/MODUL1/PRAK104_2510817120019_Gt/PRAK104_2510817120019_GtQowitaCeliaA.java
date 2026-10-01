package MODUL1.PRAK104_2510817120019_Gt;

import java.util.Scanner;

public class PRAK104_2510817120019_GtQowitaCeliaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        char abu1 = scanner.next().charAt(0);
        char abu2 = scanner.next().charAt(0);
        char abu3 = scanner.next().charAt(0);

        System.out.print("Tangan Bagas: ");
        char bagas1 = scanner.next().charAt(0);
        char bagas2 = scanner.next().charAt(0);
        char bagas3 = scanner.next().charAt(0);

        int poinAbu = 0;
        int poinBagas = 0;

        //ronde pertama
        if ((abu1 == 'B' && bagas1 == 'G') || (abu1 == 'G' && bagas1 == 'K') || (abu1 == 'K' && bagas1 == 'B')) {
            poinAbu++;
        } else if ((bagas1 == 'B' && abu1 == 'G') || (bagas1 == 'G' && abu1 == 'K') || (bagas1 == 'K' && abu1 == 'B')) {
            poinBagas++;
        }

        //ronde kedua
        if ((abu2 == 'B' && bagas2 == 'G') || (abu2 == 'G' && bagas2 == 'K') || (abu2 == 'K' && bagas2 == 'B')) {
            poinAbu++;
        } else if ((bagas2 == 'B' && abu2 == 'G') || (bagas2 == 'G' && abu2 == 'K') || (bagas2 == 'K' && abu2 == 'B')) {
            poinBagas++;
        }

        //ronde ketiga
        if ((abu3 == 'B' && bagas3 == 'G') || (abu3 == 'G' && bagas3 == 'K') || (abu3 == 'K' && bagas3 == 'B')) {
            poinAbu++;
        } else if ((bagas3 == 'B' && abu3 == 'G') || (bagas3 == 'G' && abu3 == 'K') || (bagas3 == 'K' && abu3 == 'B')) {
            poinBagas++;
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
    }
}