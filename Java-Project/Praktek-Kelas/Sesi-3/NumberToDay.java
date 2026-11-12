import java.util.Scanner;

public class NumberToDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====PEMILU 2024======");
        System.out.println("1. Anies Baswedan");
        System.out.println("2. Prabowo Subianto");
        System.out.println("3. Ganjar Pranowo");
        System.out.println("=======================");

        System.out.print("Tentukan Nomor Pilihanmu :");
        int vote = sc.nextInt();
        String pilihan="";
        String partai = "";
        switch (vote) {
            case 1:
                pilihan = "Anies Baswedan";
                partai = "PKB NASDEM";
                break;
            case 2:
                pilihan = "Prabowo Subianto";
                break;
            case 3:
                pilihan = "Ganjar Pranowo";
                break;
            default:
                pilihan = "Anda GOLPUT";
                break;
        }

        System.out.println("Selamat anda telah memilih :" + pilihan);
        System.out.println("Partai Pendukung  :" + partai);

        sc.close();
    }
}
