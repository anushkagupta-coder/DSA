//find power of given number using recursion
public class power_of_X {

    public static void main(String[] args){
        System.out.println(fun(5.0, 2));
        System.out.println(fun(10.0,5));
    }
    static double fun(double x , int n){
        long N=n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        while(N > 0){
            if(N % 2 ==1){
                result = result*x ;
            }
            x=x*x;
            N=N/2;
        }
        return result;
    }

}
