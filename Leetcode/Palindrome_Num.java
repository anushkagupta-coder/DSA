//check if number is palindrome

public class Palindrome_Num {
    public static void main(String[] args) {
        int n= 1234321;
        System.out.println("checking palindrome");
        if(n=fun(n)){
            System.out.println("palindrome");

        }
        else {
            System.out.println("Not palindrome");
        }

    }
    static int fun(int n){
        int lastdigit;
        int reverse;
        while(n!=0){
        lastdigit = n %10;
        reverse = reverse*10+n;
        n=n/10;
    }
    return reverse;
    
}
}
