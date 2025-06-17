public class sumOfDigit {
    public static int sumOfDigits(int n){
        if(n<10){
            return n;
        }

        int sum =0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return sumOfDigits(sum);
    }
    public static void main(String[] args) {
        int n = 1245;
        System.out.println("The sum of digits in "+n+" is "+sumOfDigits(n));
    }
    
}
