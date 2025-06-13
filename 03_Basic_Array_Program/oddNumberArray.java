public class oddNumberArray {

    public static int oddNumber(int [] arr,int n){
        int count = 0;
        for(int i =0; i<n; i++){
            if(arr[i]%2==1){
                count++;
            }    
         }
            return count ;
    }


    public static void main(String[] args) {
        int n = 5;
        int [] arr = {1,2,3,4,5};
        System.out.println("Odd Number in Array are "+oddNumber(arr,n));
    }    
}
