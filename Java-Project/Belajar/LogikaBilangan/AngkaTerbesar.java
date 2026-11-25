package Belajar.LogikaBilangan;

import java.util.Scanner;

public class AngkaTerbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka = 0, JumlahAngka, Terbesar = 0;

        System.out.print("Masukkan Angka : ");
        JumlahAngka = sc.nextInt();

        for (int i = 1; i <= JumlahAngka; i++) {
            System.out.print("Masukkan Angka Ke-" + i + " : ");
            Angka = sc.nextInt();
            if (Angka > Terbesar) {
                Terbesar = Angka;
            }
        }

        System.out.println(Terbesar);
        sc.close();
    }
}
