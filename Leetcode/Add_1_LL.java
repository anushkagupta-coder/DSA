class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Add_1_LL {

    static Node Add1(Node head) {

        // 1. Reverse the linked list
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Now 'prev' is the head of reversed list
        curr = prev;
        int carry = 1;   // because we are adding 1

        Node temp = null;

        // 2. Add carry to each node
        while (curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;

            temp = curr;      // keep track of last processed node
            curr = curr.next;

            if (carry == 0) break;
        }

        // 3. If carry is still left (e.g., 999 + 1 = 1000)
        if (carry == 1) {
            temp.next = new Node(1);
        }

        // 4. Reverse again to restore original order
        curr = prev;
        prev = null;
        next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; // final head
    }

    public static void main(String[] args) {
        
        // Example:
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);

        Node ans = Add1(head);

        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}
