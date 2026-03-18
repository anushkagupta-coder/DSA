import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class PtcDsa {
    public static void main(String[] args){
        /*int[] arr={2,3,4};
        int target=5;
        int[] result=TwoSumHashmap(arr,target);
        System.out.println("pair found at " + result[0] + " and "+result[1]);
        String str="abcba";
        int result = longestSubstringWithoutRepeatingCharacters(str);
        System.out.println(result);
        String s1="silent";
        String s2="listen";
        System.out.println(Anagram(s1, s2));
        int[] arr = {1,2,3,4,1};
        System.out.println(containsDuplicate(arr));
        int[] arr={1,2,3,4,5,6};
        rotateArraybyK(arr, 2);
        for(int num:arr){
            System.out.print(num+" ");
        }
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        int[] merged = MergeTwoSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(merged));
        int[] arr= {0,1,3,4,5};
        System.out.println(findMissingNumber(arr));
        String str="I love Myself";
        System.out.println(ReverseWords(str));
        System.out.println(PalindromeNumber(1212));
        int[] arr= {1,1,2,4,4,4,4};
        System.out.println(MajorityElement(arr));
        System.out.println(firstNonrepeatingcharacter("leetcode"));
        System.out.println(firstNonrepeatingcharacter("anushka"));
        System.out.println(Fibonacci(7));
        System.out.println(ValidParenthesis("{[]}"));*/
        int[] arr = {-2,1,-3,4,5};
        System.out.println(KadanesAlgorithm(arr));
    }

    public static int[] TwoSum(int[] arr,int target){
        //for sorted we use two pointer else hashmap

        int left = 0;
        int right = arr.length-1;
        while(left<right){
        int sum = arr[left] + arr[right];
        if(sum == target){
            return new int[] {left,right};
        }
        else {
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        
    }
    return new int[] { -1, -1 };
}


    public static int[] TwoSumHashmap(int[] arr,int target){
    HashMap <Integer , Integer> map = new HashMap<>();
    for(int i=0;i<arr.length ;i++){
        int need=target-arr[i];
        if(map.containsKey(need)){
            return new int[]{map.get(need),i};
        }
        map.put(arr[i],i);
    }
    return new int[]{-1,-1};
}

    public static int longestSubstringWithoutRepeatingCharacters(String str){
        //sliding window 
        //abcabab;
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int right=0 ; right < str.length() ; right++){
            char ch=str.charAt(right);
        if(map.containsKey(ch) && map.get(ch)>=left ){
            left = map.get(ch)+1;
        }
        map.put(ch,right);
        maxLength = Math.max(maxLength,right-left+1);
        
    }
    return maxLength;
}

    public static boolean Anagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character ,Integer> map=new HashMap<>();

        
        for(int i =0; i<s1.length(); i++){
        char c1=s1.charAt(i);
        char c2=s2.charAt(i);
        map.put(c1, map.getOrDefault(c1,0)+1);
        map.put(c2, map.getOrDefault(c2, 0)-1);
    }
    for(int val:map.values()){
        if(val!=0){
            return false;
        }
    }
        return true;
    }

    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
    for(int num : arr){
        if(!set.add(num)){
            return true;
        }
    }
    return false;
}

    public static void rotateArraybyK (int[] arr,int k){
        //{1,2,3,4,5}
        //pehle pura rotate phir k roatte wapis rotate
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
       
    public static void reverse(int[] arr, int left ,int right){
         while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
        
    public static int[] MergeTwoSortedArrays(int[] arr1 , int[] arr2){
        int n=arr1.length;
        int m= arr2.length;
        int i=0;
        int j=0;
        int k=0;
        int[] result= new int[n+m];

        while( i< n && j < m) {
            if(arr1[i] < arr2[j]){
                result[k]= arr1[i];
                i++;
                k++;
            }
            else{
                result[k]=arr2[j];
                j++;
                k++;
            }

        }
        //for remaing set
        while(i < n){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j < m){
            result[k] = arr2[j];
            j++;
            k++;
        }
    
        return result;

    }

    public static int findMissingNumber(int[] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length ;i++){
        sum+=arr[i];

        }
        int original = n*(n+1)/2;

        int missing = original-sum;
        return missing;
    }

    public static String ReverseWords(String str){
        //"i love myself" ;
        String[] words = str.split(" ");
        String result = "";
        for(int i=words.length-1 ;i>=0 ;i--){
            result = result+words[i] + " ";
        }
        return result.trim();
    }

    public static boolean PalindromeNumber(int num){
        int original=num;
        int reverse = 0;
        while (num>0){
        int digit=num%10;
        reverse = reverse*10 + digit ;
        num=num/10;
    }
        if(reverse==original){
            return true ;
        }
        else {
            return false;
        }

    }

    public static int MajorityElement(int[] arr){
        //this is candidate and vote question
        int candidate=0;
        int vote=0;
        for(int num : arr){
            if(vote==0){
                candidate=num;
            }
            if(num==candidate){

                vote++;
            }
            else{
                vote--;
            }
        }
        return candidate;
    }

    public static char firstNonrepeatingcharacter(String str){
        //leetcode ans is l;
        //we could use ahshmap but array freq is more nice acc to chatgpt
        int[] freq=new int[26];

        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch : str.toCharArray()){
            if(freq[ch - 'a'] == 1){
                return ch;
            }
        }
        return '#';
    }

    public static int Fibonacci(int n){
        if (n == 0)return 0;
        if (n == 1)return 1;

        int prev1=0;
        int prev2=1;
        for(int i=2;i<=n;i++){
            int fibonacci = prev1+prev2;
            prev1 = prev2;
            prev2 = fibonacci;
        }
        return prev2;

    }

    public static boolean ValidParenthesis(String str){
        //stack pehle push then pop same element aya toh pop
        Stack<Character> st = new Stack<>();
        for(char bracket : str.toCharArray()){
            if(bracket=='{' || bracket=='[' || bracket=='('){
                st.push(bracket);
            }
            else{
                if(st.isEmpty()) return false;
                char top=st.pop();
                if((bracket == ')' && top != '(') ||
               (bracket == '}' && top != '{') ||
               (bracket == ']' && top != '[')){
                return false;
            } 
        }
    }
    return st.isEmpty();
}

    public static int KadanesAlgorithm(int[] arr){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int num:arr){
            currsum = Math.max(num , num + currsum);
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum ;
        
    }
}
