//Writting this code to learn how to insert the data in linked list 
//1. insertion at starting 
//2.insertion at end 
//3.insertion at kth position

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

    static node InsertAtEnd(node head,int data){
        node newNode = new node(data);
        //if list is empty
         if (head == null) {
            head = newNode;
            return head;
        }

        node temp = head;
        while(temp.next!= null){
            temp = temp.next; 
        }
        temp.next=newNode;
        return head;
        
    }

    static node InsertAtKth(node head,int data,int k){
        node newNode = new node(data);

        if(k==1){
            newNode.next=head;
            head=newNode;
            return head;
        }

        node temp = head;
        int cnt = 1;

        // Traverse to the (k-1)th node
        while (temp != null && cnt < k - 1) {
            temp = temp.next;
            cnt++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

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
        head=InsertAtEnd(head,500);
        head= InsertAtStart(20);
        head=InsertAtKth(head, 467, 2);
        
        printLL(head);
    }
}
