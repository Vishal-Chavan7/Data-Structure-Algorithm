 class leftRotateArrayByOne {
        public static void leftRotate(int[] arr){
            int n = arr.length;
            if (n == 0) return; 
            int temp = arr[0];

            for(int i=1; i<n; i++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray after left rotation by one: ");
        leftRotate(arr);
    }
    
}
