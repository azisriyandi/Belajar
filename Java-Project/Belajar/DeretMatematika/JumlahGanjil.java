package Belajar.DeretMatematika;

import java.util.Scanner;

public class JumlahGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka, Banyak = 0;

        System.out.print("Masukkan Angka : ");
        Angka = sc.nextInt();

        for (int i = 0; i <= Angka; i++) {
            if (i % 2 != 0) {
                Banyak++;
                System.out.print(i);
                if (i < Angka - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" = " + Banyak);
        sc.close();
    }
}
