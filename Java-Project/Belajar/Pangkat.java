package Belajar;

import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka, Pangkat, Hasil = 1;

        System.out.print("Masukkan Bilangan : ");
        Angka = sc.nextInt();
        System.out.print("Masukkan Pangkat  : ");
        Pangkat = sc.nextInt();

        for (int i = 1; i <= Pangkat; i++) {
            Hasil *= Angka;
        }
        System.out.print(Hasil);
        
        sc.close();
    }
}
