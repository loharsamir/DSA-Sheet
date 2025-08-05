import java.util.*;

public class DisjointArrays {

    public static boolean areDisjoint(int[] arr1, int[] arr2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            if(set.contains(i))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 3, 2};   
        int[] arr2 = {8, 4, 7};       

        if (areDisjoint(arr1, arr2)) {
            System.out.println("Arrays are disjoint");
        } else {
            System.out.println("Arrays are not disjoint");
        }
    }
}
