public class NumberSum {


     public static int sum(int N){
        if(N<0) return 0;

        return N  + sum(N-1);
     }
    public static void main(String[] args) {
        int N = 4;
        System.out.println("The sum of first "+N+" natural numbers is "+sum(N));
    }
}
