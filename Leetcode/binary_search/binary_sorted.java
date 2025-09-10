package binary_search;
//this program uses binary search to find X from sorted ;

public class binary_sorted {
    public static void main(String[] args){

    }   
    //iterative
    static int binary(int[] arr,target){
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
    }}
    //recursive func 
}
