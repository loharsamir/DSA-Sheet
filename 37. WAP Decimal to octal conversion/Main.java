import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String octal = "";
        if(decimal==0)octal="0";

        while(decimal!=0){
            int rem=decimal%8;
            octal=rem+octal;
            decimal=decimal/8;
        }

        System.out.println(octal);
    }
}
