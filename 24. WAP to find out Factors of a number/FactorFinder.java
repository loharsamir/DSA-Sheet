import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printFactors(num); 
    }

   
    public static void printFactors(int n) {
       List<Integer>list=new ArrayList<>();
       for(int i=1;i<=n/2;i++){
        if(n%i==0)list.add(i);
       } 
       list.add(n); 
       System.out.println(list);    
    }
}
