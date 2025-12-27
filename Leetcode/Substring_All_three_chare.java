//find a substring having all 3 charecters 
//ek baar ek mili toh use right ke sab parts bhihonge hi substring having all 3 charecters
public class Substring_All_three_chare {
    public static void main(String[] args) {
        String="aabcacb";
        System.out.println(fun(s));
    }

    static void fun(String s){
        int[] count = new int[3]; // count[0]=a, count[1]=b, count[2]=c
        int left = 0;
        int ans = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += (n - right);
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}
