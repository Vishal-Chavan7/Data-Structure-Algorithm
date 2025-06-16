

public class sumOfArray {

    public static int sum(int [] nums){
        if(nums.length == 0) return 0;
        return nums[0] + sum(nums);
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(sum(nums));
    }
}
