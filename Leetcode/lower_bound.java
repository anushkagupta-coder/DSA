//program used to find lower bound (smallest index such that arr[index]>=x)
public class lower_bound {
    public static void main(String[] args) {
        int arr[] ={1,2,3,6,15};
        int target=7;
        int n=arr.length;
        System.out.println(fun(arr,target,5));
    }
    static int fun(int arr[],int target,int n){
        int low =0;
        int high=n-1;
    
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else 
            low=mid+1;
        }
        return target;
    }
}
