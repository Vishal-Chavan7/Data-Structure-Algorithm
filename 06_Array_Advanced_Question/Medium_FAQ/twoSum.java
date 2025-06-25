import java.util.*;
public class twoSum {

     public static int[] TwoSum(int [] nums, int target){
        int n = nums.length;
        Map <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int num = nums[i];
            int complement = target - num;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(num, i);
        }

        return new int[]{-1, -1}; // If no solution is found


     }

    // public static int[] TwoSum(int[] nums, int target){
    //     int n = nums.length;
        
    //     for(int i =0; i<n; i++){
    //         for(int j=i+1; j<n; j++){
    //             if(nums[i] + nums[j] == target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

    public static void main(String[] args) {
        int [] nums = {2,16,11,7,5,3,9,4};
        int target = 15;
        int result[] = TwoSum(nums,target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }
}