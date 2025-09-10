
// this program uses binary search to find X from sorted ;


public class binary_sorted{
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 6, 32};
        int target=6;
        int low=0;
        int n=arr.length;
        int high=n-1;
        //iterative result;
        System.out.println("iterative result is"+binary(arr,target));
        //recursive result;
        System.out.println("recursive result is"+recursive(arr,low,high,target));
    }   
    //iterative function 
    static int binary(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
        int mid=(low+high)/2;
        if (arr[mid]==target){
            return mid;
        }
        else if (arr[mid]>target){
            high=mid-1;
            
        }   
        else low=mid+1; 
        
    }
    return -1;
}
    //recursive func
    static int recursive(int[] arr,int low,int high,int target) {
        // First of all base condition
        if(low>high){
        return -1;}

        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return recursive(arr,mid+1,high,target);

        }
        else{ 
        return recursive(arr,low,high-1,target);
        }
    }
}
