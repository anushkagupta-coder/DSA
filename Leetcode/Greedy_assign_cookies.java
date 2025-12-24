import java.util.Arrays;
//sabse pehle isme sort karo aarays
//phir check kro using left and right pointers 
public class Greedy_assign_cookies {
    public static void main(String[] args){
        int[] greed = {1,2,3};
        int[] size = {1,1}; 

        System.out.println("answer");
        System.out.println(func(greed, size));
    }

    static int func(int[] greed , int[] size){
        int a=greed.length;
        int b= size.length;

        int left=0;
        int right=0;
        Arrays.sort(greed);
        Arrays.sort(size);
        while(left < a && right < b){
            if(size[right] >= greed[left]){
                right=right+1;
            }
            left=left+1;
        }
        return right;
    }
}
