import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHarshad(num)) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }

        sc.close();
    }


    static boolean isHarshad(int num) {
        int org=num;
        int sum=0;
        while(num!=0){
            int last=num%10;
            sum+=last;
            num/=10;
        }
        return org%sum==0;
       
    }
}