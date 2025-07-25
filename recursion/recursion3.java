//print n to 1 using recursion
import java.util.Scanner;
public class recursion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n=scanner.nextInt();
        int i;
        //int n=5;
        func(n,n);
    }
    static void func(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        func(i-1,n);
    }
}
