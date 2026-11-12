public class KasirKedaiKopiSederhana {
    public static void main(String[] args) {
        String NamaPelanggan = "Budi";
        int JumlahKopi = 4, JumlahDonat = 2;
        double HargaKopi = 18500.0, HargaDonat = 5000.0, Pajak = 0.11, DiskonTumbler = 2000.0;

        double TotalBelanja = (JumlahDonat * HargaDonat) + (JumlahKopi * HargaKopi);
        double TotalPajak = TotalBelanja * Pajak;
        double Totalall = (TotalBelanja + TotalPajak) - DiskonTumbler;

        System.out.println("Nama Pelanggan : " + NamaPelanggan);
        System.out.println("Total Akhir    : " + Totalall);

    }
}
