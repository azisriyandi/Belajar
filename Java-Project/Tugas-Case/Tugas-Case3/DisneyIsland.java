import java.util.Scanner;

public class DisneyIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Umur, Tinggi, Tarif = 0;

        System.out.print("Umur   : ");
        Umur = sc.nextInt();
        System.out.print("Tinggi : ");
        Tinggi = sc.nextInt();
        sc.close();

        if (Umur < 1) {
            System.out.println("Di Larang Masuk");
            return;
        }
        else if (Umur <= 3) {
            Tarif = 30000;
            if (Umur >= 2 && Tinggi > 70) {
                Tarif += 10000;
            }
        }
        else if (Umur <= 7) {
            Tarif = 40000;
            if (Umur >= 4 && Tinggi > 120) {
                Tarif += 15000;
            }
        }
        else if (Umur <= 10) {
            Tarif = 50000;
            if (Umur >= 8 && Tinggi > 150) {
                Tarif += 20000;
            }
        }
        else if (Umur > 10) {
            Tarif = 80000;
        }

        System.out.println("Total Tarif Anda Adalah " + Tarif);
    }
}
