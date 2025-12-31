//look 
//(()) this is valid 
//approach will be like - 
//( kab ? jab aur open brackets hamare paas bache h dalne ko 
//) kab? jab )<( why? kyuki jab open hi nhi kiya toh close kaise kroge 

import java.util.ArrayList;
import java.util.List;

public class Generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> result = new ArrayList<>();
        fun(result, "", 0, 0, n);
        System.out.println(result);
    }   
     static void fun(List<String> result,String current ,int open , int close , int n ){
        if(current.length() == n*2){
            result.add(current);
            return ;
        }

        if(open<n){
            fun(result,current+"(" ,open+1,close,n);
        }

        if(close<open){
            fun(result,current+")" , open ,close+1 , n);
        }
    } 
}
