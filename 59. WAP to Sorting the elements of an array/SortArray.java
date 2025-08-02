import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        sortArray(arr); 

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}