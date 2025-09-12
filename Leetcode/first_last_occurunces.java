//first and last occurences in array;
//this code gives us the index when element occured first time and when element occured last time iin the array;
//one of the approach is to use binary e=search and is the best the other one is using two func upper bound and lower bound;
public class first_last_occurunces {
    public static void main(String[] args) {
        int[] arr={};
        int n=arr.length;
    }
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=first(nums,target);
        if (first==-1) 
        return new int[] {-1,-1};
        int last=last(nums,target);
        return new int[] {first,last};
}
    public int first(int[]nums,int target){
        int low=0;
        int n=nums.length;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else 
                high=mid-1;
        }
        return first;
    }
        public int last(int[]nums,int target){
        int low=0;
        int n=nums.length;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last = mid;low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;

            }
            else low=mid+1;
        }
        return last;
}
}
}
