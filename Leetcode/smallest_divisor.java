public class smallest_divisor {
    public static void main(String[] args) {
        int[] arr={44,22,33,11,1};
        int[] arr2={1,2,5,9};
        int threshold=5;
        int answer=func(arr, threshold);
        int answer=func(arr2, threshold);
        System.out.println("the smallest divisor is");
        System.out.println(answer);
    }

    static int sumbyd(int[] arr, int div){
        int sum=0;
        for (int num : arr) {
            sum += Math.ceil((double) num / div);
        }
        return sum;
    }

    static int func(int[] nums,int threshold){
        int low=1;
        int high=0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;
            int sum=sumbyd(nums, mid);

            if(sum<=threshold){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
