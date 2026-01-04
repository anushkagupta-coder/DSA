import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
         Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> result = inorder(root);
        System.out.println(result);
    }
        static List<Integer> inorder(Node root){
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
      
        }
          return result;
    }
}
