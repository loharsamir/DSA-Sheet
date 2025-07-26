import java.util.Scanner;

public class Main {

    public static void swapNumbers(int a, int b) {
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        swapNumbers(a, b);
    }
}