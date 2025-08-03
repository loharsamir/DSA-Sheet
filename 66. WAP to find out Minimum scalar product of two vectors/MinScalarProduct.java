import java.util.*;

public class MinScalarProduct {

   
    public static int findMinScalarProduct(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(b);
        int product=0;
        for(int i=0;i<a.length;i++){
            product+=a[i]*b[i];
        }
        return product;
    }
    public static void reverse(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of vectors: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter elements of vector A:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

     
        System.out.println("Enter elements of vector B:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int result = findMinScalarProduct(a, b);
        System.out.println("Minimum Scalar Product: " + result);


    }
}
