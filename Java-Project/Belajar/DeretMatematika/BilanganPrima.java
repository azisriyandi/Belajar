package Belajar.DeretMatematika;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PrimaInput;

        System.out.print("Masukkan Bilangan : ");
        PrimaInput = sc.nextInt();

        for (int BilanganAngka = 2; BilanganAngka <= PrimaInput; BilanganAngka++) {
            Boolean Prima = true;
            for (int i = 2; i < BilanganAngka; i++) {
                if (BilanganAngka % i == 0) {
                    Prima = false;
                    break;
                }
            }
            if (Prima) {
                System.out.print(BilanganAngka + " ");
            }
        }
        sc.close();
    }
}
