
public class Longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"Flower" , "Flow" , "Flight"};
        System.out.println("prfix ");
        System.out.println(fun(strs));
    }   
    
    static String fun(String[] strs){
        if (strs.length == 0) 
            return " ";
        String prefix=strs[0];
    for(int i=1;i<strs.length;i++){
        while(!strs[i].startsWith(prefix)){
            prefix=prefix.substring(0,prefix.length()-1);

            if(prefix.isEmpty())
                return "";
        }
    }
    return prefix;
    }
}
