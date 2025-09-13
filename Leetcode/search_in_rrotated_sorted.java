//this code has roated arrya but in sorted manner this code will help us to find the target
public class search_in_rrotated_sorted {
    
    public static void main (string[] args){
        int[] arr={6,7,8,1,2,3,4,5};
        int n=nums.length;
        int target=4;
    }
    static int binary(int[] arr,int target,int n){
        
        int low=0;
        
        int high=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
        if(nums[mid]==target){
                return mid;
            }
        if (nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                low=mid+1;
            }
        }
        else{
                if (nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    
}

