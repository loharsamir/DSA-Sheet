import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        findPower(base, exponent);  

    
    }


    static void findPower(int base, int exponent) {
        int ans=1;
        for(int i=1;i<=exponent;i++){
            ans*=base;
        }
        System.out.println(ans);
    }
}