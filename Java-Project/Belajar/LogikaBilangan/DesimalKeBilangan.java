package Belajar.LogikaBilangan;

import java.util.Scanner;

public class DesimalKeBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Biner = 0, Pengali = 1;
        int BinerInput, Sisa;

        System.out.print("Masukkan Angka : ");
        BinerInput = sc.nextInt();

        while (BinerInput > 0) {
            Sisa = BinerInput % 2;
            Biner += Sisa * Pengali;
            Pengali *= 10;
            BinerInput = BinerInput / 2;
        }
        System.out.println(Biner);
        sc.close();
    }
}
