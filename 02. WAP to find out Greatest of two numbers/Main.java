import java.util.Scanner;

public class Main {

    public static int findGreatest(int a, int b) {
       if(a>b)return a;
       else return b;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int greatest = findGreatest(a, b);
        System.out.println("Greatest number is: " + greatest);
    }
}