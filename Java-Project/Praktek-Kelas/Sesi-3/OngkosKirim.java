import java.util.Scanner;

public class OngkosKirim {
    public static void main(String[] args) {
        int ongkosKirim = 20000;
        String member;
        int jarak;
        int totalBelanja;
        double totalBiayaKirim=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Member:");
        member = input.next();
        System.out.print("Jarak Kirim:");
        jarak = input.nextInt();
        System.out.print("Total Belanja:");
        totalBelanja = input.nextInt();

        if(member.equals("premium")){
            totalBiayaKirim=0;
        }
        else if(member.equals("reguler")){
            if(jarak <=10){
                totalBiayaKirim=0;
            }
            else if(jarak >=10 && jarak <=25){
                totalBiayaKirim = ongkosKirim;
            }
            else if(jarak > 25){
                totalBiayaKirim = 
                (ongkosKirim + 2000) + (2000 * (jarak-25));
            }

            if(totalBelanja > 500000){
                totalBiayaKirim = totalBiayaKirim - (totalBiayaKirim * 0.50); 
            }
        }

        System.out.println("Total Biaya Kirim :" + totalBiayaKirim);

        input.close();
    }
}
