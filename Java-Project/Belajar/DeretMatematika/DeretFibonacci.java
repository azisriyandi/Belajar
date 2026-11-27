package Belajar.DeretMatematika;

import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int InputFibonachi, a = 0, b = 1;

        System.out.print("Masukkan Angka : ");
        InputFibonachi = sc.nextInt();

        for (int i = 1; i <= InputFibonachi; i++) {
            System.out.print(a + " ");
            int Berikut = a + b;
            a = b;
            b = Berikut;
        }

        sc.close();
    }
}
