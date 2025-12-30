//Input: s = "(1)+((2))+(((3)))"   Output: 3


public class Max_nest_depth {
    public static void main(String[] args) {
        
    }
    static void fun(){
        int currentdepth =0;
        int maxdepth=0;

        for(int i=0;i<s.length() ;i++){
            char ch = s.charAt(i);

            if(char=='('){
                currentdepth=++;
                maxdepth = math.max(maxdepth,currentdepth)
            }
            else if(char =' )'){
                currentdepth--;
            }
        }

        retrin maxdepth;
    }
}
