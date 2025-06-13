public class reverseArray {


    // better approach
    // public static void  reversedArray(int []arr, int n){
    //     int left = 0, right = n-1;
    //     while(left<right){
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }
    //     System.out.println("Reversed Array: ");
    //     for(int i=0; i<n; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }



    // brute force approach;

    public static void reversedArray(int [] arr, int n){
        int [] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            ans[n-i-1] = arr[i];
        }

        for(int i=0; i<n; i++){
            arr[i] = ans[i];
        }

        System.out.println("Reversed Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int [] arr = {1,2,3,4,5};
        reversedArray(arr,n);
    }
}
