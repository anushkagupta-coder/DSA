//to print name 5 times using recursion
public class recursion1 {
    public static void main(String[] args) {
        int n=5;
        int i;
        func(1,n);
    }
    static void func(int i,int n){
            if(i>n)
            return;
            System.out.println("ANUSHKA");
            
            func(i+1,n);
        }
}
