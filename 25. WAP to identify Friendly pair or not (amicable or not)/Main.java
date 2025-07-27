import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        boolean result = isFriendlyPair(num1, num2);
        if (result) {
            System.out.println(num1 + " and " + num2 + " are Friendly (Amicable) Pair.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Friendly (Amicable) Pair.");
        }
    }


    public static boolean isFriendlyPair(int a, int b) {
        int sumA=0;
       for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sumA+=i;
            }
       }
       int sumB=0;
       for(int i=1;i<=b/2;i++){
            if(b%i==0){
                sumB+=i;
            }
       }
       return (sumA==b && sumB==a);
    }
}