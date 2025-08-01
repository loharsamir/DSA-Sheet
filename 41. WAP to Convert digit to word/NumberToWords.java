import java.util.Scanner;

public class NumberToWords {
    // Words for 0-19
    private static final String[] ones = {
        "Zero", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    // Words for tens multiples
    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Method to convert number to words
    public static String convertToWords(int num) {
        if(num<0){
            return "minus "+convertToWords(-num);
        }
        if(num<20){
            return ones[num];
        }
        if(num<100){
            return tens[num/10]+ ((num%10==0)?"":" "+ones[num%10]);
        }
        if(num<1000){
            return ones[num/100]+" hundrade "+(num%100==0?"":convertToWords(num%100));
        }
        if(num<10000){
            return ones[num/1000]+" thousend "+(num%1000==0?"":convertToWords(num%1000));
        }
        return "number too large";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0-9999): ");
        int number = sc.nextInt();
        System.out.println("In words: " + convertToWords(number));
    }
}
