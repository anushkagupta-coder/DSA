class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
        }
}

public class Insert_LinkedList {
static node head = null; 
    static node InsertAtStart(int data){
        node newNode = new node(data);

        newNode.next=head;
        head=newNode;
        return head;
    }

    static void printLL(node head){
        node temp = head ;
        while(temp!= null){
            System.out.print(temp.data+ "-> " );
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        head=InsertAtStart(10);
        
        head= InsertAtStart(20);
        printLL(head);
    }
}
