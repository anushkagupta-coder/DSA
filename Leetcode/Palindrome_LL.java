//this code is to find if the given LL is palindrome 

//Approach 
/*
1. first find middle of LL <How?> use hare and toroise 
2. Revers the 2nd half of the LL <HOW?> reverse the pointers make next as prev
3. Compare both the sides <HOW?>
 */


class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Palindrome_LL {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(20);
        head.next.next.next.next=new Node(10);
        System.out.println("Given LL is");
        PrintLL(head);
        System.out.println("Palindrome ? "+Check_Palindrome(head));
    
    }   
    
    static boolean Check_Palindrome(Node head){
        //find middle of LL
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }

        //reverse the 2nd half;
        Node prev=null;
        Node curr=slow;
        Node next;
        while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
        //compare;
        Node first = head;
        Node second = prev;

        while(second!=null){
            if(first.data!=second.data){return false;}
            first=first.next;
            second=second.next;
        }
        return true;
        

    }

    static void PrintLL(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
