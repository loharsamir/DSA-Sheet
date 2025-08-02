import java.util.Scanner;

public class PascalTriangle {
    
    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    
    static int binomialCoeff(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

       
        for (int i = 0; i < rows; i++) {
           
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

           
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j) + " ");
            }

            System.out.println(); 
        }

      
    }
}