

public class recursion03 {

    public static void printN(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printN(i+1, n);
    }
    public static void main(String[] args) {
        printN(1,5);
    }    
}
