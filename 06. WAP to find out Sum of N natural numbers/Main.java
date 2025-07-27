import java.util.Scanner;

public class Main {

    public static int sumOfNaturalNumbers(int n) {
        if(n==1)return 1;
        return n+sumOfNaturalNumbers(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();

        int result = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers: " + result);
    }
}