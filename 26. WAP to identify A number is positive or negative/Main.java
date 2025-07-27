import java.util.Scanner;

public class Main {

    public static String checkPositiveOrNegative(int num) {
        if(num==0)return "Zero";
        return (num>0)?"Positive":"negetive";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = checkPositiveOrNegative(num);
        System.out.println(result);
    }
}