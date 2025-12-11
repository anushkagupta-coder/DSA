public class Largest_Odd {
    public static void main(String[] args) {
        
    }

    static 
}
class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        //right to left 
        for(int i=n-1;i>=0;i--){
            int digit=num.charAt(i) - '0'; 
            if(digit%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }

}