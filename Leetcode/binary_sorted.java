
// this program uses binary search to find X from sorted ;


public class binary_sorted{
    public static void main(String[] args){
        int[] arr={1,3,4,6,32,5};
        int target=4;
        System.out.println(binary(arr,target));
    }   
    //iterative function 
    static int binary(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
        int mid=(low+high)/2;
        if (mid==target){
            return mid;
        }
        else if (mid>target){
            high=mid-1;
            
        }   
        else low=mid+1; 
        
    }
    return -1;
}
    //recursive func 
}
