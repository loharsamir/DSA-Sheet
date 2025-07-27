import java.util.Scanner;

public class Main {

    public static int reverseNumber(int num) {
        int reverse=0;
        while(num!=0){
            int last=num%10;
            reverse=10*reverse+last;
            num/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
    }
}