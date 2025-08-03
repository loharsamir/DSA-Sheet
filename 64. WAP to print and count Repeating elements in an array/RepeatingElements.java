import java.util.HashMap;
import java.util.Scanner;

public class RepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i:map.keySet()){
            if(map.get(i)>1){
                System.out.print(i+" ");
                count++;
            }
        }
        
     
        System.out.println("\nTotal number of repeating elements: " + count);

        sc.close();
    }
}