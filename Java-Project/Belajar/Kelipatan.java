package Belajar;

import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka, Batas;

        System.out.print("Masukkan Angka        : ");
        Angka = sc.nextInt();
        System.out.print("Masukkan Jumlah Batas : ");
        Batas = sc.nextInt();

        for (int i = Angka; i <= Angka * Batas; i += Angka) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
