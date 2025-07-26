public class reversearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        func(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
    static void func(int arr[],int l,int r){
        if (l>=r) {
            return ;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        func(arr,l+1,r-1);
    }
   
}
