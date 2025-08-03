import java.util.Arrays;
import java.util.Scanner;

public class CountDistinctWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

       
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1])count++;
        }

       

        System.out.println("Number of distinct elements: " + count);

       
    }
}