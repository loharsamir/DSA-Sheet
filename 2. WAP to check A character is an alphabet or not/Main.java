import java.util.Scanner;

public class Main {

    public static boolean isAlphabet(char ch) {
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (isAlphabet(ch)) {
            System.out.println("It is an alphabet.");
        } else {
            System.out.println("It is not an alphabet.");
        }
    }
}
