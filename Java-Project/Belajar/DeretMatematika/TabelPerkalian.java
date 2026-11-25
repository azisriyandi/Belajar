package Belajar.DeretMatematika;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka, Hasil = 0;

        System.out.print("Masukkan Angka : ");
        Angka = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            Hasil = Angka * i;
            System.out.println(Angka + " * " + i + " = " + Hasil );
        }
        sc.close();
    }
}
