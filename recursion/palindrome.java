


public class palindrome {
    public static void main(String[] args) {
        int n;
        
        String str="naman";
        String str2="ANUSHKA";
        String str3="aba";
        System.out.println(check(str,0));
        System.out.println(check(str2,0));
        System.out.println(check(str3,0));

    }
    static boolean check(String str,int i){
        int n=str.length();
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return check(str,i+1);
    }
}
