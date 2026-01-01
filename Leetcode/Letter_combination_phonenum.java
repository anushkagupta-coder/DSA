import java.util.ArrayList;
import java.util.List;

public class Letter_combination_phonenum {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) 
            return result;

        String[] map = {
            "", "",     // 0,1
            "abc",      // 2
            "def",      // 3
            "ghi",      // 4
            "jkl",      // 5
            "mno",      // 6
            "pqrs",     // 7
            "tuv",      // 8
            "wxyz"      // 9
        };
        backtrack(digits , 0 ,",map,result");
        return result;
    }
    static void backtrack(int start , int k , List<Integer> current){

        //base case
        if(index ==digits.length()){
            result.add(current);
            return ;
        }

        String letter = map[digits.charAt(index) - '0'];

//try each letter 
        for(char ch:letter.toCharArray()){
            backtrack(digits,index+1,current+ch ,map,result);
        }
    }
    
}
