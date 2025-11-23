//this code is to count the totL NUMBERS OF digits in the number 
public class count_digits {

    public static void main(String[] args){
        int n=12345;
        fun(n);
    }
    static void fun(int n){
        int count =0;
       while(n>0){
        n=n/10;
        count ++;
        
       }
       System.out.print("total count " + count);
    }
}
