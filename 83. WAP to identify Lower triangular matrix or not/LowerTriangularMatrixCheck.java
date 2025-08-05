import java.util.Scanner;

public class LowerTriangularMatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];


        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

       
        boolean isLowerTriangular = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(matrix[i][j]!=0){
                    isLowerTriangular=false;
                    break;
                }
            }
        }
        


        if (isLowerTriangular) {
            System.out.println("The matrix is an Lower Triangular Matrix.");
        } else {
            System.out.println("The matrix is NOT an Lower Triangular Matrix.");
        }

      
    }
}