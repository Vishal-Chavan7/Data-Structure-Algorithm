

public class palindrome_Number {


    public static boolean palindrome(int n){
        int temp = n;
        int reverse = 0;
        while(n>0){
            int num = n % 10;
            reverse =  reverse *10 + num;
            n = n /10;

        }

        if(temp == reverse) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 12345;
        boolean result = palindrome(n);
        System.out.println("The number "+n+" is palindrome " + result);
    }    
}
