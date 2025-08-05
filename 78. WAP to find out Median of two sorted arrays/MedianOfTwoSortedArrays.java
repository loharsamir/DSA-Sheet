import java.util.*;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        int m=merged.length;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++]=nums2[j++];
            }
        }  
        while(i<n1){
            merged[k++]=nums1[i++];
        }
        while(j<n2){
            merged[k++]=nums2[j++];
        }
        if(m%2==0){
            return (merged[m/2]+merged[(m-1)/2])/2.0;
        }else{
            return merged[m/2];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println("Median: " + findMedianSortedArrays(arr1, arr2));
    }
}