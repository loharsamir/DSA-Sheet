import java.util.Scanner;

public class Main {

    public static int sumInRange(int start, int end) {
        int sum=0;
       for(int i=start;i<=end;i++){
        sum+=i;
       }
       return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int result = sumInRange(start, end);
        System.out.println("Sum from " + start + " to " + end + " = " + result);
    }
}
