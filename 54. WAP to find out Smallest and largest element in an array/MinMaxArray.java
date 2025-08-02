import java.util.Scanner;

public class MinMaxArray {

    static int findMin(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    static int findMax(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
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

   
        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);

        sc.close();
    }
}