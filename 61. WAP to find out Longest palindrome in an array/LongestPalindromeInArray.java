public class LongestPalindromeInArray {
    public static void main(String[] args) {
        String[] arr = {"abc", "madam", "racecar", "hello", "noon"};
        String longest = "";

       for(String str: arr){
        if(isPalindrome(str) && str.length()>longest.length()){
            longest=str;
        }
       }
       if(!longest.equals(""))System.out.println("longest palindrome is : "+longest);
       else System.out.println("palindrome not found");
    }

    public static boolean isPalindrome(String str) {
       int left=0,right=str.length()-1;
       while(left<right){
        if(str.charAt(left)!=str.charAt(right))return false;
        left++;
        right--;
       }
       return true;
    }
}
