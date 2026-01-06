import java.util.Stack;

public class Next_greatest_element {
    public static void main(String[] args) {
        int[] arr={2,1,3};
        System.out.println(fun(arr));
    }

    static int fun(int[] arr){
        Stack<Integer> st= new Stack<>();
        int n = arr.length;
        for(int i=n;i>=0;i--){
            while(!st.isEmpty() && st.top<=arr[i]){
                st.pop;
            }

            if(st.isEmpty()){
                nge[i]=-1
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }

        return nge;
    }
}
