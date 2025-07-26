//factorial usning recursion
import java.util.Scanner;
public class recursion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("enter the numebr");
        n=scanner.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
