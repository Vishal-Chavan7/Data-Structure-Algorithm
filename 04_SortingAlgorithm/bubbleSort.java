public class bubbleSort {
    public static void bubble_Sort(int[] arr) {
        int  n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 9, 5};
        bubble_Sort(arr);
    }
}
