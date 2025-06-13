
public class sortedArray {

    public static boolean SortedArray(int [] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
public static void main(String[] args) {
    int n = 5;
    int [] arr = {1,2,3,9,5};
    System.out.println("Array is Sorted: "+SortedArray(arr,n));
 }    
}
