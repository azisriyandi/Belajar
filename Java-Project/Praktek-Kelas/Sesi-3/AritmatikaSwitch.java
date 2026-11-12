import java.util.Scanner;

public class AritmatikaSwitch {
    public static void main(String[] args) {
        
        int n1,n2,result=0;
        String operator;
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan 1:");
        n1 = input.nextInt();
        System.out.print("Bilangan 2:");
        n2 = input.nextInt();
        System.out.print("Pilih Operator (+,-,*,/,mod)");
        operator = input.next();

        switch(operator){
            case "+" : 
                result = n1 + n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;
            case "-" :
                result = n1 - n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;
            case "*" :
                result = n1 * n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;
            case "/" :
                result = n1 / n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;
            case "mod" :
                result = n1 % n2;
                System.out.println(n1 + operator + n2 + "=" + result);
                break;
            default:
                System.out.println("Operator Anda Salah!!");   
        }
        
        input.close();
    }
}
