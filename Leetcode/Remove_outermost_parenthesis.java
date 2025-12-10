//plz recheck it 
//(()())(()) -->> ()()()
public class Remove_outermost_parenthesis {
    public static void main(String[] args){
    static int fun(){
    StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    result.append(c);
                }
                depth++;
            } else { // c == ')'

            
                depth--;
                if (depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
    }
}
