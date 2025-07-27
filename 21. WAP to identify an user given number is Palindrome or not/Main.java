import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(int num) {
        int org=num;
        int reverse=0;
        while(num!=0){
            int last=num%10;
            reverse=10*reverse+last;
            num/=10;
        }
        return org==reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}