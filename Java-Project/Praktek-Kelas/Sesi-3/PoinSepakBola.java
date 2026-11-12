import java.util.Scanner;
public class PoinSepakBola {
    public static void main(String[] args) {
        int gol_kita,gol_lawan,jml_red_card;
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Gol Kita:");
        gol_kita = input.nextInt();
        System.out.print("Jumlah Gol Lawan:");
        gol_lawan = input.nextInt();
        System.out.println("Jumlah Red Card:");
        jml_red_card = input.nextInt();

        if(gol_kita > gol_lawan){
            System.out.println("Menang Point 3");
            if(jml_red_card==0){
                System.out.println("Tim Fair Play");
            }
        }
        else if(gol_kita == gol_lawan){
            System.out.println("Seri Point 1");
        }
        else{
            System.out.println("Kalah Point 0");
        }
        
        input.close();
    }
}

