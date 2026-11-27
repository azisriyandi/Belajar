import java.util.Scanner;

public class KataPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String KataInput;
        boolean Palindrome = true;

        System.out.print("Masukkan Kata : ");
        KataInput = sc.nextLine();

        for (int i = 0; i < KataInput.length() / 2 ; i++) {
            if (KataInput.charAt(i) != KataInput.charAt(KataInput.length() - 1 - i)) {
                Palindrome = false;
                break;
            }
        }
        if (Palindrome) {
            System.out.println(KataInput + " Adalah Palindrome.");
        } else {
            System.out.println(KataInput + " Bukan Palindrome.");
        }

        sc.close();
    }
}
