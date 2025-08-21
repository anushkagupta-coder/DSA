//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
public class majorityele {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                count++;
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}

