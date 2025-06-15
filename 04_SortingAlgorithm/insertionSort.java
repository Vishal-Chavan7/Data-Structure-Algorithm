public class insertionSort {
    public static int [] insertion_Sort(int [] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
 
    }

    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 0, 5};
        int []result = insertion_Sort(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
