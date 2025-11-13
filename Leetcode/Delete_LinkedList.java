
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;

    }
}

public class Delete_LinkedList {

    static node delNode(node head, int k){
        if(head==null)
        return null;

    if(k==1){
        return head.next;
    }

    node curr= head;
    for(int i =0; curr!= null && i<k-1; i++){
        curr= curr.next;
    }
    if (curr == null || curr.next == null){
        return head;
    }

    curr.next = curr.next.next;

    return head;
    }
    static void printList(node head){
        node temp=head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args){
        node head=new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next= new node(4);
        head.next.next.next.next = new node(5);

        System.out.println("original list");
        printList(head);

        int k=3;

        head = delNode(head,k);

        System.out.println("\nafter del " +k + "rd node");
        printList(head);
    }

}
