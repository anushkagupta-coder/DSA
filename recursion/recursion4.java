//sum of n numbers using recusrion without using parameters

import java.util.Scanner;

public class recursion4 {
    public static void main(String[] args) {
        //int n=4;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter n");
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return n+sum(n-1);
        
    }
}
