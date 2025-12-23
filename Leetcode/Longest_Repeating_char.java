public class Longest_Repeating_char {
    public static void main(String[] args) {
        String str = "AAABB";
        int k =2; 
        System.out.println(fun(str,k));
    }

    static int fun(String str, int k){
        int right=0;
        int left=0;
        int maxlength=0;
        int maxfreq=0;
        int[] count = new int[26];

         for(right=0; right<str.length(); right++){
            int index = str.charAt(right)-'A';
            count[index]++;

            maxfreq = Math.max(maxfreq , count[index]);


            while ((right-left +1) - maxfreq >k ) {
                count[str.charAt(left) - 'A']--;
                left++; 
                
            }

            maxlength=Math.max(maxlength , right-left+1);

         }

         return maxlength;
    }
}
