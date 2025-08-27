//here we are rearranging the numbers in the array according to sign
import java.util.*;
public class rearrangebysign {
    public static void main(String[] args) {
        int[] arr={1,-2,-3,2,3,-1};
        int[] ans =rearrange(arr);
        int posIndex=0;
        int negIndex=1;
        System.out.println(Arrays.toString(ans));

    }
    static int[] rearrange(int[] arr){
        int[] ans =new int[arr.length];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<0){
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
        }
        return ans;
    }
}
