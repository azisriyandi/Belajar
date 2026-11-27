package Belajar.LogikaBilangan;

import java.util.Scanner;

public class DesimalKeBiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int InputaAngka;
        long Biner = 0, Pengali = 1;

        System.out.print("Masukkan Angka : ");
        InputaAngka = sc.nextInt();

        while (InputaAngka > 0) {
            int Sisa = InputaAngka % 2;
            Biner += Sisa * Pengali;
            Pengali *= 10;
            InputaAngka = InputaAngka / 2;
        }
        System.out.println(Biner);
        sc.close();
    }
}
