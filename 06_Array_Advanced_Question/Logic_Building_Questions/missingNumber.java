//optimization:
// time complexity: O(N)
// space complexity: O(1)


// class Solution {
    // Function to find missing number in array
//     public int missingNumber(int[] nums) {
//         int xor1 = 0, xor2 = 0;

//         // Calculate XOR of all array elements
//         for (int i = 0; i < nums.length; i++) {
//             xor1 = xor1 ^ (i + 1); // XOR up to [1...N]
//             xor2 = xor2 ^ nums[i]; // XOR of array elements
//         }

//         // XOR of xor1 and xor2 gives missing number
//         return (xor1 ^ xor2);
//     }
// }
public class missingNumber {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int totalSum  = n * (n+1) / 2;
        int arraySum = 0;
        for(int num: arr){
            arraySum = arraySum + num;
        }

        return totalSum - arraySum; // Return the missing number

    
        
        
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 1, 5}; // Example array with a missing number
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }
}

// --------------------------------------------------------------------------------

// brute force approach to find the missing number in an array
// Timecomplexity: O(N^2)
// Spacecomplexity: O(1)
// public class missingNumber {

//     public static int findMissingNumber(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i <= n; i++) {
//             boolean found = false;
//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == i) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) {
//                 return i; // Return the missing number
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {0, 2, 3, 1, 5}; // Example array with a missing number
//         System.out.println("The missing number is: " + findMissingNumber(arr));
//     }
// }


// ----------------------------------------------------------------------------------------
// better approach using frequency array
// Time Complexity: O(N)
// Space Complexity: O(N)
//  class Solution {
    //  Function to find the missing number
//     public int missingNumber(int[] nums) {
//         int N = nums.length; 
        
//         // Array to store frequencies, initialized to 0
//         int[] freq = new int[N+1];
        
//         // Storing the frequencies in the array
//         for (int num : nums) {
//             freq[num]++;
//         }
        
//         // Checking the frequencies for numbers 0 to N
//         for (int i = 0; i <= N; i++) {
//             if (freq[i] == 0) {
//                 return i;
//             }
//         }
        
//         /* This line will never execute, 
//         it is just to avoid warnings */
//         return -1;
//     }
// }