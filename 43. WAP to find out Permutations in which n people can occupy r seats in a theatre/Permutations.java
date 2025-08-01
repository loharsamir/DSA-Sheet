import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for n and r
        System.out.print("Enter total number of people (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of seats (r): ");
        int r = sc.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input! r should be ≤ n and both should be non-negative.");
            return;
        }

        long permutations = factorial(n) / factorial(n - r);
        System.out.println("Number of ways " + n + " people can occupy " + r + " seats: " + permutations);
    }

    
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}