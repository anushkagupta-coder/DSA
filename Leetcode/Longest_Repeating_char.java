public class Longest_Repeating_char {
    public static void main(String[] args) {
        String str = "AAABB";
        int k =2; 
        System.out.println(fun(str,k));
    }

    static int fun(String str, int n){
        int right=0;
        int left=0;
        int maxlength=0;
        int maxfreq=0;
        int[] count = new int[26];

         for(int right=0; right<s.length(); right++){
            int index = s.charAt(right)-'A';
            count[index]++;

            maxfreq = Math.max(maxfreq , count[index]);


            while ((right-left +1) - maxfreq >k ) {
                count[s.charAt(left) - 'A']--;
                left++; 
                
            }

            maxlength=Math.max(maxlength , right-left+1);

         }

         return maxlength;
    }
}
