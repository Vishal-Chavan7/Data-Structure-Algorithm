public class selectionSort {

        public static void selection_Sort(int [] arr){
            int minIndex = 0;
            for(int i=0;i<arr.length-1; i++){
                minIndex = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]< arr[minIndex]){
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
                int[] arr = {1, 8, 3, 9, 5};
                selection_Sort(arr);
        }    
}
