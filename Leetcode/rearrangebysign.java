
public class rearrangebysign {
    public static void main(String[] args) {
        int[] arr={1,-2,-3,2,3,-1};
        int[] ans =new int[arr.length];
        int posIndex=0;
        int negIndex=1;

    }
    static int rearrange(int[] arr){
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
