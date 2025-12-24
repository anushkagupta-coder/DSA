public class Greedy_assign_cookies {
    public static void main(String[] args){

    }

    static void func(int[] greedy , int[] size){
        int a=greedy.length;
        int b= size.length;

        int left=0;
        int right=0;
        sort(greed);
        sort(size);
        while(left<b){
            if(greed[r]<=size[l]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }
}
