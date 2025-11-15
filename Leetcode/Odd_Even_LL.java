//The first node is considered odd, and the second node is even, and so on.
// group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.Node=null;
    }
}
public class Odd_Even_LL {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head=oddEven(head);
        printLL(head);
    }

    static Node oddEven(Node head){
        if(head==null || head.next==null)
        return head;

        Node odd=head;
        Node even = head.next;
        Node evenHead=even;

        while(even!=null && even.next!= null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }

        odd.next=evenHead;
        return head;
    }

    static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
}
