import java.util.*;
//this program is to find the maximum water cna be hold or the area kind of 
//here the trick is that the minimu heigth will decide this 
public class Maximum_water {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,3,4,5};
        int n=arr.length;
        System.out.println("maximum water");
        System.out.println(func(arr));
    }
    static int func(int[] arr,int n ){
        int height ;
        int left,right ;
        left=0;
        right=n-1;
        int max_water=0;
        int height=Math.min(arr[left],arr[right]);
        int width=(right-left);
     
        while(left<right){
            int water=width*height;
            if(water>max_water){
                max_water=water;
            }

            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right++;
            }
        }
return max_water;

    }
}
