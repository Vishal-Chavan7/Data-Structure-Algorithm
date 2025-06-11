// count the number of digits present in the number

public class count_digit {
    public static int count_digits(int n){

        if(n==0) return 1;
        int count =0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println("The number of digits in "+n+" is "+count_digits(n));
    }
}
