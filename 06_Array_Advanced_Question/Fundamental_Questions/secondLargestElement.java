public class secondLargestElement {

        public static int Second_Element(int [] nums){

            if(nums.length<2) return -1;

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for(int i=0; i<nums.length; i++){
                if(nums[i]>largest){
                    secondLargest = largest;
                    largest = nums[i];
                    }
                    else if(nums[i]>secondLargest && nums[i]!=largest){
                        secondLargest = nums[i];
                    }
            }

            return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;


        }
        public static void main(String[] args) {
        int [] nums = {2,4,3,5,7};
        System.out.println("Second largest element: "+ Second_Element(nums));
    }
}
