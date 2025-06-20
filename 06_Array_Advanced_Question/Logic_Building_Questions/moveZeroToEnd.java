

public class moveZeroToEnd {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        int j=0;
        for(int i =0; i<n; i++){
            if(nums[i]!=0){
                nums[j++] = nums[i];
            }
        }

        while(j<n){
            nums[j++] = 0;
        }
        System.out.println();
        System.out.println("Array after moving zeroes to the end: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,4,0,5,2};
        
        System.out.println("Original Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
         moveZeroes(nums);
    }
}
