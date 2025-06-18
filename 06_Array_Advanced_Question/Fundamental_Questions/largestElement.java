

public class largestElement {

    public static int largest_Element(int [] nums){
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max =  nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {2,44,4,5,7};
        System.out.println("Largest Element: "+ largest_Element(nums));
    }
}
