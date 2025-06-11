

public class largestDigit {
    
    public static int findLargest(int n){
        
    int max = 0;

    while(n>0){
        int lastDigit  = n % 10;
        if(lastDigit > max) max = lastDigit;
        n = n /10;
    }
    return max;
}

    public static void main(String[] args) {
        int n = 124986;
        int result = findLargest(n);
        System.out.println("The largest digit in "+n+" is "+result);
    }
}
