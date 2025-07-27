import java.util.Scanner;

public class Main {
  
    public static String checkVowelOrConsonant(char ch) {
       
        if("aeiouAEIOU".indexOf(ch)!=-1)return "Vowel";
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))return "Consonant";
        else return "Not a Character";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = checkVowelOrConsonant(ch);
        System.out.println(result);
    }
}
