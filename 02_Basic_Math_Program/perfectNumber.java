public class perfectNumber {

    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }  
        }
        if(sum == n) return true;
            else return false;
    }
    public static void main(String[] args) {
        int n = 7;
        boolean result = isPerfect(n);
        System.out.println("The number "+n+" is perfect " + result);
    }
}
