

public class linearSearch {

    public static int linear_Search(int [] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1
;    }
    public static void main(String[] args) {
        int [] nums = {2,3,4,5,7};
        int target = 6;
        System.out.println(linear_Search(nums,target));
    }
}
