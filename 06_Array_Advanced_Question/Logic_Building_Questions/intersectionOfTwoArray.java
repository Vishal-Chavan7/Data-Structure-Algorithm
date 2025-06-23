import java.util.*;

public class intersectionOfTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int[] intersection = findIntersection(arr1, arr2);
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        List<Integer> tempList = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i =0, j=0;
        while(i<n && j<m){

            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums2[j] >  nums1[i]){
                j++;
        }else{
            tempList.add(nums1[i]);
            i++;
            j++;
        }

        



    }
    int [] ans = new int [tempList.size()];

        for(int k=0; k<tempList.size(); k++){
            ans[k] =  tempList.get(k);
        }
    return ans;
    }
}
