
//this code is to find element which will occur only once while all other twice
public class twiceand1time {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4};
        singleNumber(nums);
    }
    
    static int singleNumber(int[] nums) {
        int xorr=0;
        for(int i=0;i<nums.length;i++){
            xorr=xorr ^ nums[i] ;
        }
        return xorr ;
    }
}

