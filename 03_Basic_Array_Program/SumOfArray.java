public class SumOfArray {
    public static int sumOfArray(int [] arr, int n){
        int sum =0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        int [] arr = {1,2,3,4,5};
        System.out.println("Sum of array is "+sumOfArray(arr,n));
    }
    
}
