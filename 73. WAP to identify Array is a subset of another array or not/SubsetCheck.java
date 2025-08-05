import java.util.HashMap;

public class SubsetCheck {

    public static boolean isSubset(int[] A, int[] B) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:B){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       for(int i:A){
        if(!map.containsKey(i) || map.get(i)==0){
            return false;
        }
        map.put(i,map.get(i)-1);
       }
       return true;

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {5, 4, 3, 2, 1};

        if (isSubset(A, B)) {
            System.out.println("A is a subset of B");
        } else {
            System.out.println("A is not a subset of B");
        }
    }
}