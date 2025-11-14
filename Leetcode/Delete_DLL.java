//this code is to delete the node in doubly linked list 
//1.delte at first
//2.delete at end 
//3.delete at kth posn

class Node {
    int data;
    Node next;
    Node back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class Delete_DLL {
    static Node head = null;

    public static void main(String[] args) {

        head = insertAtBegin(10);
        head = insertAtBegin(20);
        head = insertAtEnd(100);
        head = insertAtKth(500, 2);

        System.out.println("DLL After Insertions:");
        printDLL(head);

        head = deleteAtBegin(head);
        head = deleteAtEnd(head);
        head = deleteAtKth(head, 2);

        System.out.println("\nDLL After Deletions:");
        printDLL(head);
    }

    // ------------------ INSERTIONS ------------------

    static Node insertAtBegin(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.back = newNode;
        head = newNode;

        return head;
    }

    static Node insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.back = temp;

        return head;
    }

    static Node insertAtKth(int data, int k) {
        Node newNode = new Node(data);

        if (k == 1) {
            newNode.next = head;
            if (head != null)
                head.back = newNode;
            return newNode;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        newNode.next = temp.next;
        newNode.back = temp;

        if (temp.next != null)
            temp.next.back = newNode;

        temp.next = newNode;

        return head;
    }

    // ------------------ DELETIONS ------------------

    static Node deleteAtBegin(Node head) {
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        if (head != null)
            head.back = null;

        temp.next = null; // cleanup
        return head;
    }

    static Node deleteAtEnd(Node head) {
        if (head == null)
            return null;

        if (head.next == null)
            return null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.back.next = null;
        temp.back = null;

        return head;
    }

    static Node deleteAtKth(Node head, int k) {
        if (head == null || k <= 0)
            return head;

        if (k == 1)
            return deleteAtBegin(head);

        Node temp = head;
        int count = 1;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        Node prev = temp.back;
        Node next = temp.next;

        if (prev != null)
            prev.next = next;

        if (next != null)
            next.back = prev;

        temp.next = null;
        temp.back = null;

        return head;
    }

    // ------------------ PRINT DLL ------------------

    static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
