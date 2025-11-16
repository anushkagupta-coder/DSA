//program to delete middle Node of LL
/*
 *find mid using hare and tortoise when loop ends slow is at mid
 del slow using prev.next=slow.next
 */

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}

public class del_mid_LL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("list");
        System.out.println(PrintNode(head));
        System.out.println("after deletion");
        Node head=del(head);
        System.out.println(PrintNode(head));
    }
    static Node del(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev;
        prev.next=slow.next;

    }
    static Node PrintNode(node head){
                Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
