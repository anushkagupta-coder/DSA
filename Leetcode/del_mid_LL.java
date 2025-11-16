//program to delete middle node of LL
/*
 *find mid using hare and tortoise when loop ends slow is at mid
 del slow using prev.next=slow.next
 */

class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;

    }
}

public class del_mid_LL {
    public static void main(String[] args) {
        
    }
    static node del(node head){
        node slow=head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node prev;
        prev.next=slow.next;
        
    }
}
