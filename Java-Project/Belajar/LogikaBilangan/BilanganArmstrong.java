package Belajar.LogikaBilangan;

import java.util.Scanner;

public class BilanganArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int InputAngka, Total = 0, Asli = 0;

        System.out.print("Masukkan Angka : ");
        InputAngka = sc.nextInt();

        Asli = InputAngka;
        while (InputAngka > 0) {
            int Digit = InputAngka % 10;
            Total += (Digit * Digit * Digit);
            InputAngka = InputAngka / 10;
        }
        if (Asli == Total) {
            System.out.println(Asli + " adalah Bilangan Armstrong.");
        }
        else {
            System.out.println(Asli + " Bukan Bilangan Armstrong");
        }
        sc.close();
    }
}
