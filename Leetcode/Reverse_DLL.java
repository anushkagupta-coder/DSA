//code to reverse doubly lined list
//we can use stack but optimal way is to switch links
//kaise kiya??---- kuch nhi bas next pointer to back kar diya aur back pointer ko next kr diya 
//swapped the pointers onlyyyy 
class Node{
    int data;
    Node next;
    Node back;
    Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}

public class Reverse_DLL {
     static Node head;
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.back=head;
        
        head.next.next=new Node(30);
        head.next.next.back=head.next;

        head.next.next.next=new Node(40);
        head.next.next.next.back=head.next.next;
        System.out.println("original DLL");
        printDLL(head);
        System.out.println("reversed DLL");
        head = Reverse(head);
        printDLL(head);
    }

    static Node Reverse(Node head){
        if (head==null || head.next== null){
            return head;
        }

        Node current = head;
        Node temp = null;

        while(current!= null){
            temp=current.back;
            current.back=current.next;
            current.next=temp;
            current = current.back;
        }

        if(temp!=null){
            head=temp.back;
        }

        return head;

        
    }

    static void printDLL(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }

        System.out.println("null");
    }
}



