package Belajar.PolaNestedLoop;

import java.util.Scanner;

public class BelahKetupat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int InputAngka;

        System.out.print("Masukkan Angka : ");
        InputAngka = sc.nextInt();

        for (int i = 1; i <= InputAngka; i++) {
            for (int Spasi = 1; Spasi <= InputAngka - i; Spasi++) {
                System.out.print(" ");
            }
            for (int Bintang = 1; Bintang <= 2 * i - 1; Bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = InputAngka - 1; i >= 1; i--) {
            for (int Spasi = 1; Spasi <= InputAngka - i; Spasi++) {
                System.out.print(" ");
            }
            for (int Bintang = 1; Bintang <= 2 * i - 1; Bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
