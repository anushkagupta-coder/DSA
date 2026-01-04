import java.util.Stack;
import java.util.ArrayList;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
    }
}
public class Iterative_inorder_traversal {
    public static void main(String[] args) {
        Stack<Node> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        Node curr=root;
        
        while(curr!=null || !stack.isEmpty()){
            stack.push(curr);
            curr=curr.left;
        

        curr = stack.pop();
        result.add(curr.val);

        //go right
        curr=curr.right;
        return result;
        }
    }
}
