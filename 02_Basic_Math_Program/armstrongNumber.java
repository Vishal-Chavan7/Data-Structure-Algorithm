public class armstrongNumber {
    public static boolean isArmstrong(int n){
        int temp = n;
        int sum =0;
        while(n>0){
            int num = n % 10;
            sum = sum + num*num*num;
            n = n/10;
        }
        if(temp == sum) return true;
        else{
            return false;   
        }
    }
    public static void main(String[] args) {
        int n= 377;
        boolean result = isArmstrong(n);
        System.out.println("The number "+n+" is armstrong " + result); 
    }
    
}
