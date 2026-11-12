import java.util.Scanner;

public class NilaiCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String HasilCoding = "", NilaiInterview, HasilInterview = "";
        int NilaiCoding;

        System.out.print("Nilai Coding    : ");
        NilaiCoding = sc.nextInt();
        sc.nextLine();
        System.out.print("Nilai Interview : ");
        NilaiInterview = sc.next();

        if (NilaiCoding > 80 && NilaiCoding <= 100) {
            HasilCoding = "Lulus";
        }
        else if (NilaiCoding >= 60 && NilaiCoding <= 80) {
            HasilCoding = "Di Pertimbangkan";
        }
        else if (NilaiCoding < 60) {
            HasilCoding = "Tidak Lulus";
        }

        if (NilaiInterview.equalsIgnoreCase("A") || NilaiInterview.equalsIgnoreCase("B")) {
            HasilInterview = "Lulus";
        }
        else {
            HasilInterview = "Tidak Lulus";
        }

        if (HasilCoding.equals("Lulus") || HasilCoding.equals("Di Pertimbangkan") && HasilInterview.equals("Lulus")) {
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
        }
        else {
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }
        sc.close();
    }
}
