package Belajar.LogikaBilangan;

import java.util.Scanner;

public class PembalikAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka, Hasil = 0, Digit;

        System.out.print("Masukkan Angka : ");
        Angka = sc.nextInt();

        while (Angka > 0) {
            Digit = Angka % 10;
            Hasil = (Hasil * 10) + Digit;
            Angka = Angka / 10;
        }
        System.out.println(Hasil);
        
        sc.close();
    }
}
