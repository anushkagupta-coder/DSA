//this is a sliding window probem here we will be using teo pointers right and left 
//add into set or hashmap if not presnt if duplicate remove and move right count the total length;
import java.util.Set;
public class Longest_substring_without_repeating {
    public static void main(String[] args){
        String s="abcabad";
        System.out.println(fun(s));
    }
    static int fun(String s){
        int right=0;
        int left=0;
        int maxlength=0;
        Set<Character> set =new HashSet<>();

        while(right < s.length()){
           char currentchar = s.charAt(right);
           if(!set.contains(currentchar)){
            set.add(currentchar);
            maxlength=Math.max(maxlength , right-left+1);
            right++;
           }

           else{
            set.remove(s.charAt(left));
            left++;
           }

            }

            return maxlength;

        }

    }

