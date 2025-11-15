//to dettect if loop is present or not if present retun true


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Detect_Loop_LL {
    public static  void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // create a loop manually for testing
        head.next.next.next = head.next;
        System.out.println(DetectLoop(head));
    }

    static boolean DetectLoop(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }

        }
        return false;
    }
}
