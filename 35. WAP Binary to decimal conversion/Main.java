import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal = 0, power = 0;

        for(int i=binary.length()-1;i>=0;i--){
            int bit=binary.charAt(i)-'0';
            decimal+=bit*Math.pow(2,power);
            power++;
        }
        System.out.println(decimal);
    }
}