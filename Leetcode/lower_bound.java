//program used to find lower bound (smallest index such that arr[index]>=x)
public class lower_bound {
    public static void main(String[] args) {
        
    }
    static int[] fun(int arr[],int target,int n){
        int low =0;
        int high=n-1;
        int n;
        int ans=n;
        while(low<=high){
            if(low>=high){
                ans=mid;
                high=mid-1;
            }
            else 
            low=mid+1;
        }
        return ans;
    }
}
