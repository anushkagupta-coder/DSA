//this code is to find max sum of the subarrays and we are usingkadanes algorithm here
//what is kadanes it basically means we have a count for sum and sum 
//whenever the sum is less than 0 we reset and it and when sumcnt is greater than the sum then we keep the max cnt im mind  

public class kadanes_algorithm {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("using kadanes algorithm");
        int result=algo(nums);
        System.out.println(result);

    }

    static int algo(int nums[]){
        int sum=Integer.MIN_VALUE;
        int sumcnt=0;

        for(int i=0;i<nums.length;i++){
            sumcnt=sumcnt+nums[i];

            if(sumcnt>sum){
                sum=sumcnt;

                if(sumcnt<0){
                    sumcnt=0;
                }
            }
        }
        return sum;

    }
}
