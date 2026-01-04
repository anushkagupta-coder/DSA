import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class Iterative_inorder_traversal {
    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = inorder(root);
        System.out.println(result);
    }
    static List<Integer> inorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        TreeNode curr=root;
        
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
