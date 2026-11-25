package Belajar.SimulasiStudiKasus;

import java.util.Scanner;

public class ValidasiPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PinBenar = 1234, InputPin, Percobaan = 1;

        System.out.print("Masukkan Pin Anda : ");
        InputPin = sc.nextInt();

        while (InputPin != PinBenar && Percobaan < 3) {
            System.out.println("Pin Anda Salah Silahkan Coba Lagi.");
            System.out.print("Masukkan Pin Anda : ");
            InputPin = sc.nextInt();
            Percobaan++;
        }
        if (InputPin == PinBenar) {
            System.out.println("Pin Anda Benar! Selamat Menikmati Akun Anda.");
        } else {
            System.out.println("Akun Anda Terblokir! Sudah 3 Kali Percobaan.");
        }
        sc.close();
    }
}
