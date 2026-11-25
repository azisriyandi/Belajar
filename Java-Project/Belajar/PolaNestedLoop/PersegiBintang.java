package Belajar.PolaNestedLoop;

import java.util.Scanner;

public class PersegiBintang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Masukkan Angka : ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
