import java.util.Scanner;

public class MafiaSindikat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Pangkat = "";

        System.out.print("Nama           : ");
        String Nama = sc.nextLine();
        System.out.print("Umur           : ");
        int Umur = sc.nextInt();
        sc.nextLine();
        System.out.print("Tempat Tinggal : ");
        String TempatTinggal = sc.nextLine();
        System.out.print("Tabungan       : ");
        int Tabungan = sc.nextInt();

        if (Umur > 40 && (TempatTinggal.equalsIgnoreCase("Nevada") || TempatTinggal.equalsIgnoreCase("New York") || TempatTinggal.equalsIgnoreCase("Havana") && Tabungan > 10000000)) {
            Pangkat = "Don";
        }
        else if (Umur >= 25 && Umur <= 40 && (TempatTinggal.equalsIgnoreCase("New Jersey") || TempatTinggal.equalsIgnoreCase("Manhattan") || TempatTinggal.equalsIgnoreCase("Nevada")) && Tabungan >= 1000000 & Tabungan <= 2000000) {
            Pangkat = "Underboss";
        }
        else if (Umur >= 18 && Umur <= 24 && (TempatTinggal.equalsIgnoreCase("California") || TempatTinggal.equalsIgnoreCase("Detroit") || TempatTinggal.equalsIgnoreCase("Nevada")) && Tabungan < 1000000) {
            Pangkat = "Capo";
        }

        if (Pangkat.equals("")) {
            System.out.println(Nama + " Tidak Mencurigakan.");
        }
        else {
            System.out.println(Nama + " Kemungkinan adalah Seorang Anggota Mafia Dengan " + Pangkat + ".");
        }
        sc.close();
    }
}
