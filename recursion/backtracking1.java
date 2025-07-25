//same problem of printing 1 to n using backtracking
public class backtracking1{
    public static void main(String[] args) {
        int i;
        int n=5;
        func(n,n);
    }
    static void func(int i,int n){
        if(i<1){
            return;
    }
        func(i-1,n);
        System.out.println(i);

    }
}