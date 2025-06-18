public class findMaxConsecutive {

    public static int findMaxConsecutives(int[] nums) {
        int max = 0, current = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }
        return max;
    }
     
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutives(nums));
    }
}