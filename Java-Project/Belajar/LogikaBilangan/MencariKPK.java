package Belajar.LogikaBilangan;

import java.util.Scanner;

public class MencariKPK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nilai1, Nilai2, KPK;

        System.out.print("Masukkan Nilai KPK 1 : ");
        Nilai1 = sc.nextInt();
        System.out.print("Masukkan Nilai KPK 2 : ");
        Nilai2 = sc.nextInt();

        if (Nilai1 > Nilai2) {
            KPK = Nilai1;
        } else {
            KPK = Nilai2;
        }
        
        while (true) {
            if (KPK % Nilai1 == 0 && KPK % Nilai2 == 0) {
                break;
            } else {
                KPK++;
            }
        }
        System.out.println(KPK);
        sc.close();
    }
}