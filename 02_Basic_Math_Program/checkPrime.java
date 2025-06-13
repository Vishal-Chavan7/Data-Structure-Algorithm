public class checkPrime {


    public static boolean isPrime(int n){
        if(n<2) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 9;
        boolean result = isPrime(n);
        System.out.println("The number "+n+" is prime " + result);
    }
    
}
