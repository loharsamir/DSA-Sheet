import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 4, 2, 3, 5, 6};
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        
        System.out.println("Array after removing duplicates:");
        System.out.println(set);
       
    }
}