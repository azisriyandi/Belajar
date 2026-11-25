package Belajar.DeretMatematika;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Angka, Hasil = 1;

        System.out.print("Masukkan Angka : ");
        Angka = sc.nextInt();

        for (int i = 1; i <= Angka; i++) {
            Hasil *= i;
            System.out.print(i);
            if (i < Angka) {
                System.out.print(" X ");
            }
        }
        System.out.println(" = " + Hasil);
        sc.close();
    }
}
