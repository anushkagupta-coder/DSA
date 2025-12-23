public class Max_consecutive_1's {
    public static void main(String[] args){
        int[] nums= {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println("Answer");
        System.out.println(fun(nums, k));

    }

    static int fun(int[] nums , int k){
        int right=0;
        int left=0;
        int zerocount=0;
        int maxLength=0;

        for(right=0 ; right<nums.length; right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[left] == 0 ){
                    zerocount--;
                }

                left++;
            }
        }
        maxLength = Math.max(maxLength, right - left + 1);
        return maxLength;
    }
    
}
