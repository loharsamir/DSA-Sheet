import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = replaceZeroWithOne(num);
        System.out.println(result);
    }

    public static int replaceZeroWithOne(int num) {
        if(num==0)return 1;
        int temp=num;
        num=Math.abs(num);
        int result=0;
        int place=1;
        while(num!=0){
            int last=num%10;
            if(last==0)last=1;
            result+=last*place;
            place*=10;
            num/=10;
        }
        if(temp<0)return -result;
        else return result;



    }
}

