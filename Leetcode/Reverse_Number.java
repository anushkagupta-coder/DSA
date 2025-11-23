//this code is to reverse the number 
//123==321
import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number to reverse");
        int n=scanner.nextInt();
        fun(n);

    }

    static void fun(int n){
        //n=n%10;
        //n=n/10;
        while (n>0) {
            n=n%10;
            lastdigit=n/10;
            rev=rev*10+lastdigit;
            //reversed = reversed *10 +last digit;
        }

       
    }
}
