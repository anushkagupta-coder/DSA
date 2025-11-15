//this code is to find the middle node of tbe linked list 
//brute force - 
//optimal approach tortoise and hare slo and fast pointe r
/*in slow and fast pointer start from the head both pointer s and then two options 
1.length is odd {
    when fast pointer reachers the last node the slow pointer is pointing to the middle node
    };
2.lenght of LL is even{
    here fats pointer reaches to the null not last node and at that time slow points to the middle node
    }
*/

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class middle_LL {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next= new Node(50);
        head.next.next.next.next.next= new Node(60);
        
        System.out.print("Linked List: ");
        printLL(head);

        Node mid = Middle(head);
        System.out.println("\nMiddle node is: " + mid.data);

    }

    static Node Middle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

}
