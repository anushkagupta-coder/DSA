//same as to find element in sorted rotated array but here numbers will not be unique;
public class search_unique_rotated {
    public static void main(String[] args){
        int[] arr={8,9,10,1,2,3,3,3,5,6,7};
        int n=arr.length;
        int target=3;
        System.out.println(binary(arr,target,n));
    }
    static boolean binary(int[] arr,int target,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[low]==arr[mid]){
                low++;
                continue;
            }
            if(arr[mid]==arr[high]){
                high--;
                continue;
            }
            if(arr[low]<=arr[high]) {
                if (arr[low]<=target && target<arr[mid]) {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if (arr[mid]<target && target<=arr[high]) {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;

    }
}
