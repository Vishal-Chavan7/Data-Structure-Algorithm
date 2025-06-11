public class count_Odd_Number {

    public static int countOddNumber(int n) {
        if(n==0) return 0;
        int count =0;

        while(n>0){
            if(n%2!=0)  count++;            
            n = n /10;
        }
        return count;
    }       
    public static void main(String[] args) {
        
        int n = 1234567; 
        System.out.println("The number of odd numbers in "+n+" is "+ countOddNumber(n));
    }
}
