public class reverseArray {
    public static int [] reverse(int [] arr, int left, int right){
        if(left>=right){
            return arr;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left+1, right-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int left = 0;
        int right = arr.length-1;
        int [] result = reverse(arr, left, right);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        }
    
}
