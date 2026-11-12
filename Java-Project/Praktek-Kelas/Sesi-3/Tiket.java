import java.util.Scanner;

public class Tiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlAnak,jmlRemaja,jmlDewasa,jmlLansia;
        int hargaAnak = 10000;
        int hargaRemaja = 15000;
        int hargaDewasa = 25000;
        int hargaLansia = 0;

        int totalAnak =0;
        int totalRemaja = 0;
        int totalDewasa = 0;
        int totalLansia = 0;

        int diskon=0;

        int totalHarga = 0;
        int totalBayar = 0;

        System.out.println("===============================");
        System.out.println("1. Anak-anak (" + hargaAnak + ")");
        System.out.println("2. Remaja (" + hargaRemaja + ")");
        System.out.println("3. Dewasa (" + hargaDewasa + ")");
        System.out.println("4. Lansia (" + hargaLansia + ")");
        System.out.println("================================");

        System.out.print("Anak-anak : ");
        jmlAnak = sc.nextInt();

        System.out.print("Remaja : ");
        jmlRemaja = sc.nextInt();

        System.out.print("Dewasa : ");
        jmlDewasa = sc.nextInt();

        System.out.print("Lansia : ");
        jmlLansia = sc.nextInt();

        totalAnak = jmlAnak * hargaAnak;
        totalRemaja = jmlRemaja * hargaRemaja;
        totalDewasa = jmlDewasa * hargaDewasa;
        totalLansia = 0;

        totalHarga = totalAnak + totalRemaja + totalDewasa + totalLansia;

        if(totalHarga > 100000){
            diskon = 5;
        }

        totalBayar = totalHarga - ((totalHarga * diskon)/100); 

        System.out.println("Pemesanan Tiket Anda:");
        System.out.println
        ("Anak-anak :" + jmlAnak + "*" + hargaAnak + "=" + totalAnak);
        System.out.println
        ("Dewasa :" + jmlDewasa + "*" + hargaDewasa + "=" + totalDewasa);
        System.out.println
        ("Remaja :" + jmlRemaja + "*" + hargaRemaja + "=" + totalRemaja);
        System.out.println
        ("Lansia :" + jmlLansia + "*" + hargaLansia + "=" + totalLansia);
        System.out.println
        ("Total Harga :" + totalHarga);
        System.out.println("Diskon :" + ((totalHarga * diskon)/100));
        System.out.println("Total Bayar : " + totalBayar);

        sc.close();
    }
}
