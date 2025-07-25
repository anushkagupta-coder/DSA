//to print name 5 times using recursion
public class recursion1 {
    public static void main(String[] args) {
        int n=5;
        f(i,n);
    }
    public void f(i,n){
            if(i>n)
            return;
            System.out.println("ANUSHKA");
            f(i+1,n);
        }
}
