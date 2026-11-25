package Belajar.PolaNestedLoop;

import java.util.Scanner;

public class PersegiTiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PersegiTiga, PersegiBalik;

        System.out.print("Masukkan Angka : ");
        PersegiTiga = sc.nextInt();

        for (int i = 1; i <= PersegiTiga; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("Masukkan Angka : ");
        PersegiBalik = sc.nextInt();

        for (int i = PersegiBalik; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
