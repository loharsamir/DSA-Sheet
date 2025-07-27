import java.util.Scanner;

public class Main {
    public static int factorial(int n){
        if(n==0)return 1;
        return n*factorial(n-1);
    }

    public static Boolean isStrongNumber(int num) {
       int org=num;
       int sum=0;
       while(num!=0){
        int last=num%10;
        sum+=factorial(last);
        num/=10;
       }
       return org==sum;
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(isStrongNumber(number))System.out.println("Strong Number");
        else System.out.println("Not a Strong number");
    }
}
