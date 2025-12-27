//Anagram if numebr of letter means length is same and ordeer doesnt matter also frequency of letters is same
public class Valid_anagram {
    public static void main(String[] args) {
        String s="anushka";
        String t="ushkaan";
        System.out.println("are they anagram");
        System.out.println();

    }
    static boolean fun(String s,String t){
        if(s.length()!= t.length()){
            return false;

        }

        char[] a=s.toCharArray();
        char[] b= t.toCharArray();
        Arrays.sort(a);
        Array.sort(b);

        return Arrays.equals(a,b)
    }
}
