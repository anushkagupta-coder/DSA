class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(int val){
        this.val=val;
    }
}
public class Balanced_binary_tree {
    public static void main(String[] args) {
        
     TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(isBalanced(root)); // true / false
    }

     static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    static int height(TreeNode curr){
        if(curr==null)
            return 0;

    
    int left = height(curr.left);
    if(left==-1)
        return -1;

    int right = height(curr.right);

    if(right==-1)
        return -1;
// ✅ balance check
        if (Math.abs(left - right) > 1)
            return -1;

        // ✅ height return
        return 1 + Math.max(left, right);
    }
}
