class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class height_tree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int height = maxDepth(root);
        System.out.println(height);
    }

    static int maxDepth(TreeNode curr) {

        // base case
        if (curr == null)
            return 0;

        int left = maxDepth(curr.left);
        int right = maxDepth(curr.right);

        return 1 + Math.max(left, right);
    }
}
