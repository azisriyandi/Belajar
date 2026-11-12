import java.util.Scanner;

public class NoPungung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int No;
        String Posisi = "";

        System.out.print("Masukkan No : ");
        No = sc.nextInt();

        if (No % 2 == 0) {
            Posisi = "Attacker ";
            if (No >= 50 && No <= 100) {
                Posisi += "Berhak Di Pilih Menjadi Captain Team ";
            }
        }
        else {
            Posisi = "Defender ";
            if (No > 90) {
                Posisi += "Playmaker ";
            }
            if (No % 3 == 0 && No % 5 == 0) {
                Posisi += "Keeper ";
            }
        }
        System.out.print(Posisi);

        sc.close();
    }
}
