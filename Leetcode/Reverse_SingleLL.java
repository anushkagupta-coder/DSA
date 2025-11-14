
//what to do is ----- reverse or swap the pointers 
//next ab abck , back is nxt

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Reverse_SingleLL {
    
    static Node head = null;
    public static void main(String[] args){
        head = new Node(10);
        head.next=new Node(20);
        head.next.next = new Node(40);

        System.out.println("Before reverse");
        printLL(head);
        System.out.println("after reverse");
        head=ReverseLL(head);
        printLL(head);
    }

    static Node ReverseLL(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
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

