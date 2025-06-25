public class twoSum {

    public static int[] TwoSum(int[] nums, int target){
        int n = nums.length;
        
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] nums = {2,16,11,7,5,3,9,4};
        int target = 15;
        int result[] = TwoSum(nums,target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }
}