package Belajar.PolaNestedLoop;

import java.util.Scanner;

public class PiramidaBintang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Piramida;

        System.out.print("Masukkan Angka : ");
        Piramida = sc.nextInt();

        for (int i = 1; i <= Piramida; i++) {
            for (int j = 1; j <= Piramida - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}