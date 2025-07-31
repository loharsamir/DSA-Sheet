import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        int decimal = 0, power = 0;

        for(int i=octal.length()-1;i>=0;i--){
            int bit=octal.charAt(i)-'0';
            decimal+=bit*Math.pow(8,power);
            power++;
        }
        String binary="";
        while(decimal!=0){
            int rem=decimal%2;
            binary=rem+binary;
            decimal/=2;
        }
        System.out.println(binary);
    }
}
