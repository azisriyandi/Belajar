package Belajar.SimulasiStudiKasus;

import java.util.Scanner;

public class SimulasiAtm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double CekSaldo = 0.0;
        int PilihAngka, SetorSaldo = 0, TarikTunai = 0;

        do {
            System.out.println("=========================");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih Menu : ");
            PilihAngka = sc.nextInt();
            switch (PilihAngka) {
                case 1:
                    System.out.printf("Rp %,.2f\n", CekSaldo);
                    break;
                case 2:
                    System.out.print("Masukkan Saldo : ");
                    SetorSaldo = sc.nextInt();
                    CekSaldo = CekSaldo + SetorSaldo;
                    break;
                case 3:
                    System.out.printf("Rp %,.2f\n", CekSaldo);
                    System.out.print("Tarik Tunai : ");
                    TarikTunai = sc.nextInt();
                    if (TarikTunai < CekSaldo) {
                        CekSaldo = CekSaldo - TarikTunai;
                    } else {
                        System.out.println("Saldo Tidak Cukup.");
                    }
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (PilihAngka != 4);
        sc.close();
    }
}