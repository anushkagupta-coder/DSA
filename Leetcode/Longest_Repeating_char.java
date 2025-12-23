public class Longest_Repeating_char {
    public static void main(String[] args) {
        int{} str = "AAABB";
        int k =2; 
        System.out.println(fun(arr,n));
    }

    static fun(int[] arr, int n){
        int right=0;
        int left=0;
        int maxlenght=0;
        int maxfreq=0;
         for(int right=0; right<s.length() ; right++){
            int index = s.charAt(right)-'A';
            count[index]++;

            maxfreq = Math.max(maxfreq , count[index]);


            while ((right-left +1) - maxfreq >k ) {
                count[s.charAt(left) - 'A']--;
                left++; 
                
            }

            maxlenght=Math.max(maxlenght , right-left+1);

         }

         return maxLenght;
    }
}
