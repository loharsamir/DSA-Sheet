import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isAbundant(num)) {
            System.out.println(num + " is an Abundant number.");
        } else {
            System.out.println(num + " is not an Abundant number.");
        }

      
    }

    static boolean isAbundant(int num) {
       int sum=0;
       for(int i=1;i<=num/2;i++){
         if(num%i==0){
            sum+=i;
         }
       }
       return sum>num;
    }
}
