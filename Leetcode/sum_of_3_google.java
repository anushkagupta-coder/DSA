//google leetcode question ..this program will show how many 3 numbers will have addition 0;
public class sum_of_3_google {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> threesum(int[] nums){
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k= nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nu))
                }
            }
        }
    }
}
