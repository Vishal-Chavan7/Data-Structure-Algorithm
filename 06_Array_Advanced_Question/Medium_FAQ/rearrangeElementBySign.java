// import java.util.List;
// import java.util.ArrayList;

public class rearrangeElementBySign {
    // optimal approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int [] rearrange(int[] arr) {
        int n = arr.length;
        int [] ans = new int[n];

    int posIndex = 0;
    int negIndex = 1;
    

    for(int i = 0; i<n; i++){
        if(arr[i]<0){
            ans[negIndex] = arr[i];
            negIndex = negIndex + 2;
        }else{
            ans[posIndex] = arr[i];
            posIndex = posIndex + 2;
        }
    }
        return ans;
    }

    // brute force approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // public static int [] rearrange(int[] arr){
    //     int n = arr.length;
    //     List<Integer> positive = new ArrayList<>();
    //     List<Integer> negative = new ArrayList<>();

    //     for(int i=0; i<n; i++){
    //         if(arr[i] >=0){
    //             positive.add(arr[i]);
    //         }else{
    //             negative.add(arr[i]);
    //         }
    //     }

    //     for(int i=0; i<n/2; i++){
    //         arr[2*i] = positive.get(i);
    //         arr[2*i + 1] = negative.get(i);
    //     }
    //     return arr;
    // }
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
