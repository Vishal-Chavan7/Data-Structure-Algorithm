public class reverse_Number {
    public static int reverse_number(int n) {
            int reverse = 0;
            while(n>0){
                int rem = n%10;
                reverse = reverse * 10 + rem;
                n = n/10;
            }

            return reverse;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("The reverse number of "+n+" is "+reverse_number(n));
    }
}
