package Belajar.PolaNestedLoop;

import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SegitigaAngka;

        System.out.print("Masukkan Angka : ");
        SegitigaAngka = sc.nextInt();

        for (int i = 1; i <= SegitigaAngka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
