public class checkArraySorted {

    public static boolean checkArray(int [] nums, int index){
        if(index>=nums.length-1) return true;

        if(nums[index]>nums[index+1]) return false;

        return checkArray(nums, index+1);
    }


    public static void main(String[] args) {
        
    
    int [] nums = {1,2,3,4};
    boolean result = checkArray(nums,1);
    System.out.println(result);
}

}
