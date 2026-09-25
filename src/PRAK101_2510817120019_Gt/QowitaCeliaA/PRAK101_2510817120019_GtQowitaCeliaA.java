package PRAK101_2510817120019_Gt.QowitaCeliaA;

import java.util.Locale;
import java.util.Scanner;

public class PRAK101_2510817120019_GtQowitaCeliaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = scanner.nextInt();

        if ((tahun % 4 == 0 && tanggal > 29 && bulan == 2) || (tahun % 4 != 0 && tanggal > 28 && bulan == 2)) {
            System.out.println("Validasi Gagal: Bulan Febuari pada tahun tersebut maksimal sampai 28/29 hari.");
            System.exit(0);
        }

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double berat = scanner.nextDouble();

        String[] namaBulan = {"", "Januari", "Febuari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("\nNama Lengkap " + nama + ", Lahir di " + tempatLahir +
                " pada Tanggal " + tanggal + " " + namaBulan[bulan] + " " + tahun);
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");

        scanner.close();
    }
}