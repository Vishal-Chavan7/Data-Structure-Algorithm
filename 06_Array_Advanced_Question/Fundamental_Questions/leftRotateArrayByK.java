public class leftRotateArrayByK {

    public static int [] reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void leftRotate(int[] arr, int k){
        int n = arr.length;
         k =  k % n;

        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr,0 , n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5,6,7};
        int k=2;
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray after left rotation by "+ k + ": ");
        leftRotate(arr,k);
    }
}
