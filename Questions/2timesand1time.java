
//this code is to find element which will occur only once while all other twice
public class 2timesand1time {
    class Solution {
    public int singleNumber(int[] nums) {
        int xorr=0;
        for(int i=0;i<nums.length;i++){
            xorr=xorr ^ nums[i] ;
        }
        return xorr ;
    }
}
}
