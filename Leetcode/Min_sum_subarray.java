//we need to find hr subarray ke min element ka sum basically
//how we gonna do that is - agar hume pata chal jaye ki har leemnt ka contribution kya hai
//contribution = arr[i] * leftdistance * right distance
//left and right diatance kaha se aayenege toh woh hota hai next smaller element and previous samller element se 
//how so look agar sammler hai toh woh utni baar aayega contribution me 

import java.util.Stack;

public class Min_sum_subarray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};

    int result = sumsubarraymin(arr);

    System.out.println(result);
    }
    static int sumsubarraymin(int[] arr){
        int n=arr.length;
        int mod=(int) 1e9 + 7;

        int[] left =new int[n];
        int[] right=new int[n];
        Stack<Integer> st=new Stack<>();
//previous smaller left
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i]=i+1;
            }
            else{
                left[i] = i-st.peek();
            }
            st.push(i);
        }
        st.clear();

        //next smaller 
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = st.peek() - i;
            }

            st.push(i);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + (long) arr[i] * left[i] * right[i]) % mod;
        }

        return (int) ans;
    }

}
