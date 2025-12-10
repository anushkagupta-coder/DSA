//here the trick is that the minimu heigth will decide this 
public class Maximum_water {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,3,4,5};
        int n=arr.length;
        System.out.println("maximum water");
        System.out.println(func(arr , n));
    }
    static int func(int[] arr,int n ){
        int left=0 ;
        int right=n-1 ;
        int max_water=0;
        
     
        while(left<right){
            
            int height=Math.min(arr[left],arr[right]);
            int width=(right-left);
            int water=width*height;
            if(water>max_water){
                max_water=water;
            }

            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
return max_water;

    }
}
