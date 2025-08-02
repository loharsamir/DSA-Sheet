import java.util.Scanner;
import java.util.Arrays;

public class ArrayComparison {

    static boolean areArraysSame(int[] arr1, int[] arr2) {
       if(arr1.length!=arr2.length)return false;
       return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean result = areArraysSame(arr1, arr2);
        System.out.println("Are arrays same? " + result);

    }
}