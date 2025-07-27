import java.util.Scanner;

public class Main {

    public static int findFactorial(int num) {
        if(num==0)return 1;
        return num*findFactorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = findFactorial(num);
        System.out.println("Factorial: " + result);
    }
}