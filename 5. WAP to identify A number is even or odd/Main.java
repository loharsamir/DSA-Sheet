import java.util.Scanner;

public class Main {

    public static String isEvenOrOdd(int num) {
       return (num%2==0)?"Even":"Odd";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = isEvenOrOdd(num);
        System.out.println(result);
    }
}
