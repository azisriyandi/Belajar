package Belajar.SimulasiStudiKasus;

import java.util.Scanner;

public class KasirWarung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan, harga = 0, Nasi = 15000, Mie = 12000, es = 4000;
        int porsimie, porsinasi, porsies;

        do {
            System.out.println("===== Menu Warung =====");
            System.out.println("1. Nasi Goreng (Rp. 15000)");
            System.out.println("2. Mie Ayam (Rp. 12000)");
            System.out.println("3. Es teh (Rp. 4000)");
            System.out.println("4. Selesai dan bayar");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Jumlah porsi : ");
                    porsinasi = input.nextInt();
                    harga += Nasi * porsinasi;
                    break;
                case 2:
                    System.out.print("Jumlah Porsi : ");
                    porsimie = input.nextInt();
                    harga += porsimie * Mie;
                    break;
                case 3:
                    System.out.print("Jumlah Porsi : ");
                    porsies = input.nextInt();
                    harga += porsies * es;
                    break;
                case 4:
                    int totalBelanja = harga;
                    double diskon = harga * 0.1;
                    System.out.println("Total Belanja : " + harga);
                    double bayar = totalBelanja;
                    if (totalBelanja >= 50000) {
                        System.out.println("Diskon : " + diskon);
                        bayar = totalBelanja - diskon;
                    }
                    System.out.println("Total Bayar : " + bayar);
                    break;
                default:
                    break;
            }
        } while (pilihan != 4);
        input.close();

    }
}
