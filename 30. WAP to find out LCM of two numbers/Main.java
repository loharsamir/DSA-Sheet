import java.util.Scanner;

public class Main {
    public static int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b= a%b;
            a=temp;
        }
        return a;
    }     
    
    public static int findLCM(int a, int b) {
        return a*b/GCD(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
