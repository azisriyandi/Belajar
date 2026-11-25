package Belajar.LogikaBilangan;

import java.util.Scanner;

public class JumlahTiapDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Angka, Digit = 0, Hasil = 0;

        System.out.print("Masukkan Angka Digit : ");
        Angka = sc.nextInt();
        
        while (Angka > 0) {
            Digit = Angka % 10;
            Hasil = Hasil + Digit;
            Angka = Angka / 10;
            System.out.print(Digit);
            if (Angka > 0) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + Hasil);
        sc.close();
    }
}
