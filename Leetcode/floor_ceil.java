/*first of all 
floor=largest no in array <= x;
ceil= smallest no in array >= x*/
public class floor_ceil {
    public static void main(String[] args) {
        int[] arr={23,34,39,45,56,67,70};
        int n=arr.length;
        int x=46;
        System.out.println(floor(arr,x,n));
        System.out.println(ceil(arr,x.n));
    }
    static int floor(int[] arr,int x,int n){
        int ans=-1;
        int low=0;
        int high=n-1;
        while (low<=high) { 
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else 
            high=mid-1;
        }
        return ans;
    }
    static int ceil(int[] arr,int x,int n){
        int ans=-1;
        int low=0;
        int high=n-1;
        while (low<=high) { 
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else 
            high=mid-1;
        }
        return ans;
    }
}
