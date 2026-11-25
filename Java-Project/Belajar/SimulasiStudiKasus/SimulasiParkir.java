package Belajar.SimulasiStudiKasus;

import java.util.Scanner;

public class SimulasiParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pilihan = 0, JumlahKendaraan = 0, BerapaJam = 0;
        double Motor = 2000.0, Mobil = 5000.0, Truk = 10000.0, Tarif = 0.0, TotalPendapatan = 0.0;

        do {
            System.out.println("=========================");
            System.out.printf("1. Motor (Rp %,.2f/Jam)\n", Motor);
            System.out.printf("2. Mobil (Rp %,.2f/Jam)\n", Mobil);
            System.out.printf("3. Truk (Rp %,.2f/Jam)\n", Truk);
            System.out.println("4. Tutup Shift dan Laporan");
            System.out.println("=========================");
            System.out.print("Masukkan Pilihan : ");
            Pilihan = sc.nextInt();

            switch (Pilihan) {
                case 1:
                    System.out.print("Berapa Jam : ");
                    BerapaJam = sc.nextInt();
                    JumlahKendaraan ++;
                    Tarif = Motor * BerapaJam;
                    if (BerapaJam > 5) {
                        Tarif -= 3000.0;
                    }
                    TotalPendapatan += Tarif;
                    System.out.printf("Biaya Parkir : Rp %,.2f\n", Tarif);
                    break;
                case 2:
                    System.out.print("Berapa Jam : ");
                    BerapaJam = sc.nextInt();
                    JumlahKendaraan ++;
                    Tarif = Mobil * BerapaJam;
                    if (BerapaJam > 5) {
                        Tarif -= 3000.0;
                    }
                    TotalPendapatan += Tarif;
                    System.out.printf("Biaya Parkir : Rp %,.2f\n", Tarif);
                    break;
                case 3:
                    System.out.print("Berapa Jam : ");
                    BerapaJam = sc.nextInt();
                    JumlahKendaraan ++;
                    Tarif = Truk * BerapaJam;
                    if (BerapaJam > 5) {
                        Tarif -= 3000.0;
                    }
                    TotalPendapatan += Tarif;
                    System.out.printf("Biaya Parkir : Rp %,.2f\n", Tarif);
                    break;
                case 4:
                    System.out.printf("Jumlah Kendaraan : %d\n", JumlahKendaraan);
                    System.out.printf("Jumlah Kendaraan : Rp %,.2f\n", TotalPendapatan);
                    break;
            
                default:
                    break;
            }
        } while (Pilihan != 4);
        sc.close();
    }
}
