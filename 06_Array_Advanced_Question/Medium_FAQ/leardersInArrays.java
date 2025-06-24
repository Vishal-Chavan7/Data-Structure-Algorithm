import java.util.*;
public class leardersInArrays {
    // optimal approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static ArrayList<Integer> printLeaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int maxFromRight = nums[nums.length - 1];
        ans.add(maxFromRight);
        
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                ans.add(maxFromRight);
            }
        }
        
        Collections.reverse(ans); // Reverse to maintain order
        return ans;
    }






    // brute force approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // public  static ArrayList<Integer> printLeaders(int [] nums){
    //     ArrayList<Integer> ans = new ArrayList<Integer>();
    //     for(int i = 0; i< nums.length; i++){
    //         boolean leader = true; 
    //         for(int j= i+1; j<nums.length; j++){
    //             if(nums[j] > nums[i]){
    //                 leader = false ;
    //                 break;
    //             }
    //         }
    //         if(leader){
    //             ans.add(nums[i]);
    //         }
    //     }
    //     return ans;
    // }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 40};
        ArrayList<Integer> ans = printLeaders(arr);
        System.out.print("Leaders in the array are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    }

