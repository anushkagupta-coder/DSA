import java.util.Scanner;

// to print from 1-N using recusrion

public class recursion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n=scanner.nextInt();
        int i;
        
        func(1,n);
    }
    static void func(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        func(i+1,n);
    }
}
