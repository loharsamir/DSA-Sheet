import java.util.Scanner;

public class Main {

    public static int countDigits(int num) {
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int digitCount = countDigits(num);
        System.out.println("Number of digits: " + digitCount);
    }
}