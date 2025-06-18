public class fibonacci_Series {
    public static int fib(int n){
        // base case
        if( n ==0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
  }
    public static void main(String[] args) {
        int n = 6;
        int result  = fib(n);
        System.out.println(result);
    }
}