public class Main {

    public boolean isPrime(int num) {
     if (num <= 1) return false;      
     if (num == 2) return true;        
    if (num % 2 == 0) return false;  

      for(int i=3;i<=Math.sqrt(num);i+=2){
        if(num%2==0)return false;
      }
      return true;
    }

    public void checkPrimeSum(int num) {
        for(int i=1;i<=num;i++){
            if(isPrime(i)){
                if(isPrime(num-i)){
                    System.out.println("this number be expressed as a sum of two prime numbers");
                    return;
                }
            }
        }
        System.out.println("this number not be expressed as a sum of two prime numbers");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.checkPrimeSum(25); 
    }
}