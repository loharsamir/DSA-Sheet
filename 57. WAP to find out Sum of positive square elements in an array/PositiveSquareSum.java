import java.util.Scanner;

public class PositiveSquareSum {

    static int sumOfPositiveSquares(int[] arr) {
        int sum=0;
        for(int i:arr){
            if(i>0){
                sum+=i*i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = sumOfPositiveSquares(arr);
        System.out.println("Sum of positive square elements: " + result);

       
    }
}