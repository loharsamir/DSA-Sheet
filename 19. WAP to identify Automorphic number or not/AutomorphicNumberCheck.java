 import java.util.Scanner;

public class AutomorphicNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean result = isAutomorphic(num);
        
        if(result)
            System.out.println(num + " is an Automorphic number.");
        else
            System.out.println(num + " is not an Automorphic number.");
        
        sc.close();
    }

    public static boolean isAutomorphic(int num) {
        
        int org=num;
        int digit=0;
        while(num!=0){
            digit++;
            num/=10;
        }
        int square=org*org;
        int lastDigit=square % (int)Math.pow(10,digit);
        return lastDigit==org;

    }
}
