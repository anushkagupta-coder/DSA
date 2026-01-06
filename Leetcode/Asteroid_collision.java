import java.util.Stack;

public class Asteroid_collision {

    public static void main(String[] args) {
        int[] arr = {10, 2, -5};

        int[] ans = fun(arr);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    static int[] fun(int[] arr) {

        Stack<Integer> st = new Stack<>();

        for (int a : arr) {

            boolean destroyed = false;

            // collision condition
            while (!st.isEmpty() && st.peek() > 0 && a < 0) {

                if (Math.abs(st.peek()) < Math.abs(a)) {
                    st.pop();   // stack asteroid destroy
                }
                else if (Math.abs(st.peek()) == Math.abs(a)) {
                    st.pop();   // both destroy
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true; // current destroy
                    break;
                }
            }

            if (!destroyed) {
                st.push(a);
            }
        }

        // stack → array
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
