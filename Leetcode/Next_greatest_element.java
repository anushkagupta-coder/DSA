import java.util.Stack;

public class Next_greatest_element {
    public static void main(String[] args) {
        int[] arr={2,1,3};

        int[] ans = fun(arr);
        for (int x : ans) {
    System.out.print(x + " ");
}
    }

    static int[] fun(int[] arr){
        Stack<Integer> st= new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }

        return nge;
    }
}
