import java.util.Scanner;

public class Main {

    public static boolean isArmstrong(int num) {
        int org=num;
        int sum=0;
        int temp=num;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        while(num!=0){
            int last=num%10;
            sum+=Math.pow(last,count);
            num/=10;

        }
        return org==sum;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}