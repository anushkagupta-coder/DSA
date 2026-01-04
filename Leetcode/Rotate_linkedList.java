public class Rotate_linkedList {
    if(head==null || head.next==null || k==0){
        return head;
    }

    ListNode tail =head;
    int n=1;
    while(tail.next!=null){
        tail=tail.next;
        n++;
    }

    k=k%n;
    if(k==0)
        return head;

    ListNode newtail=head;

}
