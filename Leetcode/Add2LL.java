//program to add two linked list which are given in reverse order add tham 
//and give the output added linked list in reverse order

class Node{
    int data;
    int next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Add2LL {
    public static void main(String[] args) {
        
    }
    static Node Add(Node L1, Node l2){

        Node dummy= new Node(0);
        Node curr=dummy;

        int carry=0;

        while( L1!= null|| L2!= null || carry!=0){
            int x=(L1!=null) ? L1.val:0;
            int y =(L2!= null )? L2.value:0;

            int sum=x+y+carry;
            carry=sum/10;

            curr.next=new Node(sum%10);
            curr=curr.next;
            
            if(L1!=null ) L1 =L1.next;
            if(L2!=null ) L2 =L2.next;
            
        }

        return dummy.next;
    }


    static vois printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
        }
        System.out.println("null");
    }
}
