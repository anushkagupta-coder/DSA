public class search_insert_position {
    public static void main(String[] args) {
        int arr[] ={1,2,3,6,15,34,39,80};
        int target=50;
        int n=arr.length;
        System.out.println(fun(arr,target,8));
    }
    static int fun(int arr[],int target,int n){
        int low =0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else 
            low=mid+1;
        }
        return ans;
    } 
}
