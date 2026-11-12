import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        String no_mobil; //1234
        String hari = "Selasa";//Denda 50.000
        Scanner input = new Scanner(System.in);
        System.out.print("Nomor Mobil:");
        no_mobil = input.next();
        if(Integer.parseInt(no_mobil)%2==0 && 
        (hari=="Selasa" || hari=="Kamis" || hari=="Sabtu")){
            System.out.println("No.Mobil anda Genap, Denda 50.000");
        }
        else{
            System.out.println("No. Mobil anda Ganjil");
        }
        input.close();
    }
}
