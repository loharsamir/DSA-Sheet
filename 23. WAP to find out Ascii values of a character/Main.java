import java.util.Scanner;

public class Main {

    public static int getAsciiValue(char ch) {
       return (int)ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = getAsciiValue(ch);
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
    }
}