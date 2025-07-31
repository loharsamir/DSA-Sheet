public class Main {
    public static boolean isArmstrong(int num) {
        int temp=num;
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        int sum=0;
        num=temp;
        while(num!=0){
            int last=num%10;
            sum+=Math.pow(last,count);
            num/=10;
        }
        return sum==temp;
    }

    public static void printArmstrongInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
       
        printArmstrongInRange(100, 999);
    }
}