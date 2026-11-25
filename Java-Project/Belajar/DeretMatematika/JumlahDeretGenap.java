package Belajar.DeretMatematika;

import java.util.Scanner;

public class JumlahDeretGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka, Total = 0;

        System.out.print("Masukkan Angka : ");
        Angka = sc.nextInt();

        for (int i = 2; i <= Angka; i += 2) {
            Total += i;
            System.out.print(i + " ");
        }
        System.out.print(" = " + Total);
        sc.close();
    }
}
