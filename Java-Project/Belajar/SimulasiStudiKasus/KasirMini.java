package Belajar.SimulasiStudiKasus;

import java.util.Scanner;

public class KasirMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int JumlahBarang = 0;
        double Harga, Total = 0;

        System.out.print("Masukkan Harga : ");
        Harga = sc.nextInt();

        while (Harga != 0) {
            Total = Total + Harga;
            JumlahBarang++;
            
            System.out.print("Masukkan Angka : ");
            Harga = sc.nextInt();
        }
        System.out.println("Total Barang   : " +JumlahBarang);
        System.out.printf("Total Harga    : Rp %,.2f\n", Total);

        sc.close();
    }
}
