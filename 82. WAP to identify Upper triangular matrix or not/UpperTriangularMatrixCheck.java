import java.util.Scanner;

public class UpperTriangularMatrixCheck {
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

       
        boolean isUpperTriangular = true;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(matrix[i][j]!=0){
                    isUpperTriangular=false;
                    break;
                }
            }
        }


        if (isUpperTriangular) {
            System.out.println("The matrix is an Upper Triangular Matrix.");
        } else {
            System.out.println("The matrix is NOT an Upper Triangular Matrix.");
        }

        sc.close();
    }
}