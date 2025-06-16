public class factorialNumber {

    public static int factorial(int i,int n){
        if( i > n) return 1;
        
        return i * factorial(i+1,n);
    }
    public static void main(String[] args) {
        int n = 5;
        int i =1;
        System.out.println("The factorial of "+n+" is "+factorial(i,n));
    }
}
