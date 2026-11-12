import java.util.Scanner;
public class Angka2Huruf {
    public static void main(String[] args) {
        /*
            85 - 100 => A, 80 - 84 => B, 73 - 79 => C
            65 - 72 => D, < 65 => E
        */
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("Isikan Nilai Anda:");
        nilai = input.nextInt();

        if(nilai >=85 && nilai <=100){
            System.out.println("Nilai Anda : A");
        }
        else if(nilai >=80 && nilai <=84){
            System.out.println("Nilai Anda : B");
        }
        else if(nilai>=73 && nilai <=79){
            System.out.println("Nilai Anda : C");
        }
        else if(nilai >=65 && nilai <=72){
            System.out.println("Nilai Anda : D");
        }
        else if(nilai >=0 && nilai <=65){
            System.out.println("Nilai Anda : E");
        }
        else{
            System.out.println("Input Anda Salah");
        }
        input.close();
    }
}
