public class majorityele {
    public static void main(String[] args) {
        int[] nums={1,1,1,0,2,3};
        System.out.println(majorityElement(nums))
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

