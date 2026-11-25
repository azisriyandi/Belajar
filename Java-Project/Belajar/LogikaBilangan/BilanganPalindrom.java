package Belajar.LogikaBilangan;

import java.util.Scanner;

public class BilanganPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int AngkaPalind, Asli = 0, Balik = 0, Digit = 0;

        System.out.print("Masukkan Angka : ");
        AngkaPalind = sc.nextInt();

        Asli = AngkaPalind;
        while (AngkaPalind > 0) {
            Digit = AngkaPalind % 10;
            Balik = (Balik * 10) + Digit;
            AngkaPalind = AngkaPalind / 10;
        }
        
        if (Asli == Balik) {
            System.out.println(Asli + " adalah bilangan palindrom");
        } else {
            System.out.println(Asli + " bukan bilangan palindrom");
        }
        sc.close();
    }
}
