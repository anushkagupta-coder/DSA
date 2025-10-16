
//this code is to find out the only single element that is occuring singly in the sortred array baaki sab occuring twice 
public class single_element_in_sorted_array {
    public static void main(String[] args) {
        
        int [] arr={1,1,2,2,3,4,4,5,5};
        int n=arr.length;
        int a=func(arr,n);

        System.out.println(a);

    }

    static int func (int[] arr, int n){
        int left=0 ;
        int right=n-1;
        while(left<right){
            int mid=(left+right)/2;
        

        if( (mid% 2 == 0 && arr[mid]==arr[mid+1]  || (mid%2==1 && arr[mid]==arr[mid-1])  )){
         
            left =mid+1;
        }else{
            right=mid;
            }
    }
    return arr[left];
    }
}
