package Belajar.SimulasiStudiKasus;

import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Reguler = 35000.0, Primier = 70000.0, Imax = 55000.0, Diskon = 0.15, TotalPemasukan = 0.0, SubTotal = 0.0;
        int Studio, TotalTiket = 0, JumlahTiket;

        do {
            System.out.println("========== Tiket Bioskop ==========");
            System.out.printf("1. Reguler          : Rp %,.2f\n", Reguler);
            System.out.printf("2. Primier          : Rp %,.2f\n", Primier);
            System.out.printf("3. Imax             : Rp %,.2f\n", Imax);
            System.out.println("4. Tutup Loket dan Laporan");
            System.out.println("===================================");
            System.out.print("Pilih Studio        : ");
            Studio = sc.nextInt();

            switch (Studio) {
                case 1:
                    System.out.print("Jumlah Tiket        : ");
                    JumlahTiket = sc.nextInt();
                    SubTotal = Reguler * JumlahTiket;
                    if (JumlahTiket >= 4) {
                        SubTotal -= SubTotal * Diskon;
                    }
                    TotalTiket += JumlahTiket;
                    TotalPemasukan += SubTotal;
                    System.out.printf("Total Bayar         : Rp %,.2f\n", SubTotal);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Jumlah Tiket        : ");
                    JumlahTiket = sc.nextInt();
                    SubTotal = Primier * JumlahTiket;
                    if (JumlahTiket >= 4) {
                        SubTotal -= SubTotal * Diskon;
                    }
                    TotalTiket += JumlahTiket;
                    TotalPemasukan += SubTotal;
                    System.out.printf("Total Bayar         : Rp %,.2f\n", SubTotal);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Jumlah Tiket        : ");
                    JumlahTiket = sc.nextInt();
                    SubTotal = Imax * JumlahTiket;
                    if (JumlahTiket >= 4) {
                        SubTotal -= SubTotal * Diskon;
                    }
                    TotalTiket += JumlahTiket;
                    TotalPemasukan += SubTotal;
                    System.out.printf("Total Bayar         : Rp %,.2f\n", SubTotal);
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("Total Tiket Terjual : %d\n", TotalTiket);
                    System.out.printf("Total Pemasukan     : Rp %,.2f\n", TotalPemasukan);
                    break;
            
                default:
                    break;
            }
        } while (Studio != 4);

        sc.close();
    }
}
