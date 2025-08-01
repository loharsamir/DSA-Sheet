import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==cols || j==1){
                    System.out.print("*");
                }else{
                     System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    
    }
}