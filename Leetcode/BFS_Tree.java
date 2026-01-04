import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
};

public class BFS_Tree {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // 🖨️ Print level order traversal
        List<List<Integer>> levels = levelOrder(root);
        for (List<Integer> level : levels) {
            System.out.println(level);

            
    }
 static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node > q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0 ; i<size ;i++){
                Node curr = q.poll();
                level.add(curr.val);
                if(curr.left!=null){
                q.add(curr.left);
                }

                if(curr.right!=null){
                q.add(curr.right)
                }

            }           
            result.add(level);
        }
        return result;
    }
}


    
