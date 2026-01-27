import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}




public class Boundary_traversal {
public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right.right = new TreeNode(6);

        System.out.println(boundaryTraversal(root));
    }
    public static List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        // ✅ Add root ONLY if it is not a leaf
        if (!isLeaf(root)) {
            result.add(root.val);
        }

        // Left boundary
        addLeftBoundary(root.left, result);

        // Leaf nodes
        addLeaves(root, result);

        // Right boundary
        addRightBoundary(root.right, result);

        return result;
    }

    // LEFT BOUNDARY (excluding leaves)
    static void addLeftBoundary(TreeNode curr, List<Integer> result) {
        while (curr != null) {
            if (!isLeaf(curr)) {
                result.add(curr.val);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    // LEAF NODES
    static void addLeaves(TreeNode curr, List<Integer> result) {
        if (curr == null) return;

        if (isLeaf(curr)) {
            result.add(curr.val);
            return;
        }

        addLeaves(curr.left, result);
        addLeaves(curr.right, result);
    }

    // RIGHT BOUNDARY (excluding leaves, bottom-up)
    static void addRightBoundary(TreeNode curr, List<Integer> result) {
        Stack<Integer> stack = new Stack<>();

        while (curr != null) {
            if (!isLeaf(curr)) {
                stack.push(curr.val);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
    }

    static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    // TEST
    
}
