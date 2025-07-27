import java.util.Scanner;

public class Main {

    public static int sumOfDigits(int num) {
        int sum=0;
        while(num!=0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int digitSum = sumOfDigits(num);
        System.out.println("Sum of digits: " + digitSum);
    }
}