//this code is to practise insertion of the data in Doubly linked list'
//we will have to pointer back and next 
//1.insertion at beggining 
//2.insertion at end 
//3.insertion at kth position 

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

public class Insert_DLL {
    static Node head = null;
    public static void main(String[] args) {
        
        head =insertAtBegin(10);
        head =insertAtBegin(80);
        head=insertAtEnd(300,head);
        head = insertatKth(999, head, 2);
        head=insertAtBegin(30);
        printDLL(head);

    }


    static Node insertAtEnd(int data, Node head){
        Node newNode= new Node(data);
        if(head == null )
        return newNode;
        
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    newNode.back = temp;

    return head;

    }

    static Node insertatKth(int data, Node head , int k){
        Node newNode= new Node(data);

        if(k==1){
            newNode.next=head;
            if(head!=null)
            head.back=newNode;
            return newNode;

        }

         Node temp = head;
    int count = 1;

    while(temp != null && count < k-1){
        temp = temp.next;
        count++;
    }

    // If k is out of bounds (beyond list length)
    if(temp == null){
        System.out.println("Invalid position");
        return head;
    }

    // Insert in between or at end
    newNode.next = temp.next;
    newNode.back = temp;

    if(temp.next != null) 
        temp.next.back = newNode;

    temp.next = newNode;

    return head;
}




    static Node insertAtBegin(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head.back=newNode;
        head=newNode;
        return head;
    }

    static void printDLL(Node head){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }

}
