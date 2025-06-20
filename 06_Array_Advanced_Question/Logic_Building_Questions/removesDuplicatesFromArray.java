public class removesDuplicatesFromArray {
    public static int moveZeroes(int [] nums){
        if (nums.length == 0) {
            return 0;
        }
        
        
        int i = 0;
        
        
        for (int j = 1; j < nums.length; j++) {
            /*If current element is different 
            from the previous unique element*/
            if (nums[i] != nums[j]) {
                /* Move to the next position in 
                the array for the unique element*/
                i++;
                /* Update the current position 
                   with the unique element*/
                nums[i] = nums[j];
            }
        }
        
        // Return the number of unique elements
        return i + 1;
    }
         
    
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        System.out.println("Unique Elements in array are: " + moveZeroes(arr));
    }
}
