import java.util.*;

public class OddFrequencySum {
    public static int sumOddFrequencyElements(int[] arr) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       int sum=0;
       for(int i:map.keySet()){
        if(map.get(i)%2==1){
            sum+=i;
        }
       }
       return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};
        System.out.println("Sum of elements with odd frequency: " + sumOddFrequencyElements(arr));
    }
}