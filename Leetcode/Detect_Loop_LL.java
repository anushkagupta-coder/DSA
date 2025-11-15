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
        Node head= new Node(10);

    }

    static Node DetectLoop(Node head){
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
