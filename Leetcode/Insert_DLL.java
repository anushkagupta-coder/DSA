//this code is to practise insertion of the data in Doubly linked list'
//we will have to pointer back and next 
//1.insertion at beggining 
//2.insertion at end 
//3.insertion at kth position 

class node{
    int data;
    node next;
    node back;
    node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}

public class Insert_DLL {
    static node head = null;
    public static void main(String[] args) {
        
        node head = new node(10);
        node head=insertNode(30);
        printDLL(head);

    }

    static node insertNode(int data,int prev , int next){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head.back=newNode;
        head=newNode;
        return head;
    }

    static void printDLL(node head){
        node temp=head;
        while(temp!= null){
            System.out.println(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }

}
