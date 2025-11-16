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
    Node(Node head){
        this.data=data;
        this.next=null;
    }
}
public class Sort_LL {
    public static void main(String[] args) {
        
    }
    static Node Merge_Sort(Node head){
        //1.find of LL (hare and tortoise)
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
