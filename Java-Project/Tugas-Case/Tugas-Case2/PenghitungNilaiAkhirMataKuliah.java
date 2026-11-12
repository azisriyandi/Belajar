public class PenghitungNilaiAkhirMataKuliah {
    public static void main(String[] args) {
        String NamaMahasiswa = "Siti", NIM = "2024001";
        double NilaiTugas = 85.0, NilaiUTS = 78.0, NilaiUAS = 90.0;
        double BobotTugas = 0.30, BobotUTS = 0.30, BobotUAS = 0.40;

        double NilaiAkhir = (NilaiTugas * BobotTugas) + (NilaiUAS * BobotUAS) + (NilaiUTS * BobotUTS);

        System.out.println("Nama Mahasiswa : " + NamaMahasiswa);
        System.out.println("NIM            : " + NIM);
        System.out.println("Nilai Akhir    : " + NilaiAkhir);
    }
}
