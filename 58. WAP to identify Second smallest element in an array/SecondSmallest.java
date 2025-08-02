import java.util.Scanner;

public class SecondSmallest {

    static int findSecondSmallest(int[] arr) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<first){
                second=first;
                first=num;
                
            }else if(num>first && num<second){
                second=num;
            }
            
        }
        return second==Integer.MAX_VALUE? -1:second;
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

        int result = findSecondSmallest(arr);

        if (result == -1) {
            System.out.println("Second smallest element not found (all elements may be equal).");
        } else {
            System.out.println("Second smallest element is: " + result);
        }

        sc.close();
    }
}