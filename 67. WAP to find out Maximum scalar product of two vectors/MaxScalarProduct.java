import java.util.*;

public class MaxScalarProduct {

   
    public static int findMaxScalarProduct(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int product=0;
        for(int i=0;i<a.length;i++){
            product+=a[i]*b[i];
        }
        return product;
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

        int result = findMaxScalarProduct(a, b);
        System.out.println("Maximum Scalar Product: " + result);


    }
}
