public class fibonacci {
    public static void main(String[] args) {
        int n=3;
        System.out.println(func(n));
    }
    static int func(int n){
        if(n<=1){
            return n;
        }
        int last=func(n-1);
        int secondlast=func(n-2);
        return last+secondlast;
    }
}
