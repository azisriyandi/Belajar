package Belajar.LogikaBilangan;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean Prima = true;
        int Angka;

        System.out.print("Masukkan Angka : ");
        Angka = sc.nextInt();
        
        if (Angka <= 1) {
            Prima = false;
        }
        else {
            for (int i = 2; i < Angka; i++) {
                if (Angka % i == 0) {
                    Prima = false;
                    break;
                }
            }
        }
        if (Prima) {
            System.out.println(Angka + " Adalah Bilangan Prima.");
        } else {
            System.out.println(Angka + " Bukan Bilangan Prima.");
        }
        sc.close();
    }
}
