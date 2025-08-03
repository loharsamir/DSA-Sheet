import java.util.*;

public class CountFrequency {

    public static void countFrequency(int[] arr) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       for(int i:map.keySet()){
        System.out.println("Frequency of "+i+" -> "+map.get(i));
       }
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
        countFrequency(arr);
    }
}