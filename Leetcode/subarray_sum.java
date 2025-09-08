public class subarray_sum{
    public static void main(String[] args) {
        int[] nums={0,2,3,4,5,2,1,4};
        int target=5;
        subarray(nums,target);
    }
    static int subarray(int[] nums ,int target){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=nums[j];
                if(sum==target){
                    count++;
                }
            }
        }
        return count;
    }

}