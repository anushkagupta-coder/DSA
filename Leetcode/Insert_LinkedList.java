class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=next;
        }
}

public class Insert_LinkedList {

    static node InsertAtStart(int data){
        node newNode = new node(data);

        newNode.next=head;
        head=newNode;
        return head;
    }

    static void printLL(node head){
        node temp = head ;
        while(temp! = null){
            System.out.println(temp.data+ "-> " );
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        
    }
}
