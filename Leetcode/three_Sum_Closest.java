


//this code is to find the number which is closest to the target sum
public class three_Sum_Closest {
    public static void main(String[] args){
        int[] arr={1,-2,3,5};
        int target=1;
        int n=arr.length;
        System.out.println("closest sum to the target is");
        fun(arr,n,target);
    }

    static void fun(int[] arr, int n , int target){
        //1.sort
        //2.two pointer
        //3.keep updating closest sum
        int left,right;
        arr.sort()
        int closest_sum= arr[0]+arr[1]+arr[2];
        for(i=0;i<n;i++){
            left=i+1;
            right=n-1
        }
        while(left < right){
            current_sum = arr[i]+arr[left]+arr[right];

            if(current_sum<target){
                right-=1;
            }
            if(current_sum>target){
                left+=1;
            }
            else {
                return target;
            }
            
    }
}
