import java.util.*;

public class SortByFrequency {

    public static int[] sortByFrequency(int[] arr) {
        int n=arr.length;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       List<Integer>[] freq=new ArrayList[n+1];
       for(int i:map.keySet()){
        if(freq[map.get(i)]==null)freq[map.get(i)]=new ArrayList<>();
        freq[map.get(i)].add(i);
       }
       int idx=0;
       for(int i=n;i>=0;i--){
        if(freq[i]!=null){
            for(int j:freq[i]){
                for(int k=0;k<i;k++){
                    arr[idx++]=j;
                }
            }
        }
       }
       return arr;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 9, 5, 3, 7};
        int[] sorted = sortByFrequency(arr);
        System.out.println(Arrays.toString(sorted));
    }
}