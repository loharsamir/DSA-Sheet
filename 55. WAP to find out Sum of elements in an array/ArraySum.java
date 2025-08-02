import java.util.Scanner;

public class ArraySum {

    static int findSum(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = findSum(arr);
        System.out.println("Sum of array elements: " + sum);
       
    }
}
