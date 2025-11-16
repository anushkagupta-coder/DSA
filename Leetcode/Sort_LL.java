//we are req to sort LL ;
//Approach-we will use merge sorrt 
/*
1.find ,iddle of the LL
2.sort both LL
3.merge them 
 */

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Sort_LL {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(80);
        head.next.next=new Node(30);
        head.next.next.next=new Node(23);
        head.next.next.next.next=new Node(47);
        head.next.next.next.next.next=new Node(27);
        Node result=sort(head);
        printList(result);
        

    }
//1.find of LL (hare and tortoise)
//2.sort
//3.merge them 

    

    static Node sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid = getmid(head);
        Node lefthead=head;
        Node righthead=mid.next;
        mid.next=null;

        Node left = sort(lefthead);
        Node right = sort (righthead);

        return Merge(left,right);

    }


    static Node getmid(Node head){

        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    static Node Merge(Node a,Node b){
        Node dummy = new Node(-1);
        Node temp=dummy;

        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.next=a;
                a=a.next;
            }
            else{
                temp.next=b;
                b=b.next;
            }
            temp=temp.next;
        }
             if(a != null) temp.next = a;
        if(b != null) temp.next = b;

        
        return dummy.next;
        
        

    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
