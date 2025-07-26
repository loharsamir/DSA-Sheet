import java.util.Scanner;

public class Main {

   
    public static int findGreatest(int a, int b, int c) {
        if(a>b && a>c)return a;
        else{
            if(b>c)return b;
            else return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int greatest = findGreatest(a, b, c);
        System.out.println("Greatest number is: " + greatest);
    }
}