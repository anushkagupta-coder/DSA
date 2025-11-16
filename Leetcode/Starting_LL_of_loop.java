//return the node where the cycle begins. If there is no cycle, return null.
/*APPROACH
1.find if loop exist<HOW?> hare and tortoise if both pointer meet loop exist
2.keep slow as 
 */


 class Node{
    int data;
    Node head;
    Node(int data){
        this.data=data;
        this.next=null;
    }
 }
public class Starting_LL_of_loop {
    static Node head=null;
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head.next;
    }
    static Node Starting(Node head){
        //1.find if loop exist;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            break;
        }
        if (fast == null || fast.next == null) {
        return null;
    }

        slow = head;

        while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
    }
}
