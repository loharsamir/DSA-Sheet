import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

    public static void findTriplets(int[] arr, int target) {
       int n=arr.length;
       Arrays.sort(arr);
       boolean found=false;
       for(int i=0;i<n;i++){
          int left=i+1,right=n-1;
          while(left<right){
            int sum = arr[i]+arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                found=true;
                left++;
                right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
          }
       }
       if(!found){
        System.out.println("No triplet are found");
       }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        findTriplets(arr, target);
    }
}