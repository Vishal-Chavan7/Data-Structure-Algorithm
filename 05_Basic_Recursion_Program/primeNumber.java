public class primeNumber {

    public static boolean isPrime(int num, int i){
        if (num <= 1) return false;
        if(i > Math.sqrt(num)) return true;

        if(num%i==0) return false;

        return isPrime(num,i+1);
    }

    public static void main(String[] args) {
        int num =0;
        System.out.println(isPrime(num,2));
    }
    
}
