import java.util.Scanner;

public class CountEvenOdd {

    public static void countEvenOdd(int[] arr) {
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)even++;
            else odd++;
        }
        System.out.println("Even elements: " + even);
        System.out.println("Odd elements: " + odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countEvenOdd(arr);
    }
}