
// print x for n times
public class recursion02 {

    static void printNumber(int x, int n){
        if(n==0){
            return;
        }
        System.out.println(x);
        printNumber(x,n-1);

    }
    public static void main(String[] args) {
        printNumber(4,3);
    }    
}
