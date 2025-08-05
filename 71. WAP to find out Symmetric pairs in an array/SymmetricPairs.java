import java.util.*;

public class SymmetricPairs {

    public static void findSymmetricPairs(int[][] pairs) {
        HashMap<Integer,Integer>map=new HashMap<>();
       for(int[] pair: pairs){
          int first=pair[0];
          int second=pair[1];
          if(map.containsKey(second) && map.get(second)==first){
            System.out.println("(" + first + ", " + second + ")");
          }else{
            map.put(first,second);
          }
          
       }
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {10, 20},
            {30, 40},
            {20, 10},
            {40, 30},
            {50, 60}
        };
        findSymmetricPairs(pairs);
    }
}