public class TagihanMakanBareng {
    public static void main(String[] args) {
        int JumlahOrang = 5;
        double TotalBelanja = 345000.0, Service = 0.05, JumlahTip = 20000.0;

        double TotalServices = TotalBelanja * Service;
        double Totalall = TotalServices + TotalBelanja + JumlahTip;
        double Bayarperorang = Totalall / JumlahOrang;

        System.out.println("Total Akhir    : " + Totalall);
        System.out.println("Bayar Perorang : " + Bayarperorang);
    }
}
