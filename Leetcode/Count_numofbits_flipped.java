public class Count_numofbits_flipped {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        System.out.println(fun(start,goal));
    }
    static void fun(int start , int goal){
        int xor = start^ goal;
        int count =0;

        while(xor>0){
            count+=xor&1; //last bit check
            xor>>=1; //right shift
        }
    }


}
