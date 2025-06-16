public class ArraySumRecursion {

    public static int sumArray(int[] nums, int index) {
        if (index == nums.length) {
            return 0;  // base case
        }
        return nums[index] + sumArray(nums, index + 1);  // recursive case
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        int result = sumArray(nums, 0);  // start from index 0
        System.out.println("Sum = " + result);
    }
}
