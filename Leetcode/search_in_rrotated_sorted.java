//this code has roated aaray but in sorted manner this code will help us to find the target
public class search_in_rrotated_sorted {
    

        public static void main(String[] args){
        int[] arr={6,7,8,1,2,3,4,5};
        int n=arr.length;
        int target=4;
        System.out.println(binary(arr,target,n));
    }
    static int binary(int[] arr,int target,int n){
        
        int low=0;
        
        int high=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
        if(arr[mid]==target){
                return mid;
            }
        if (arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                low=mid+1;
            }
        }
        else{
                if (arr[mid]<=target && target<=arr[high]){
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

