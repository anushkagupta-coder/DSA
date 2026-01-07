import java.util.HashMap;

class Node {
    int key, value;
    Node prev, next;

    Node(int k, int v) {
        key = k;
        value = v;
    }
}

public class LRU_DLLandMap {

    int capacity;
    HashMap<Integer, Node> map;
    Node head, tail;

    // constructor
    public LRU_DLLandMap(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0); // dummy head
        tail = new Node(0, 0); // dummy tail

        head.next = tail;
        tail.prev = head;
    }

    // remove node from DLL
    void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // add node right after head
    void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    // move existing node to head
    void moveToHead(Node node) {
        remove(node);
        addToHead(node);
    }

    // get operation
    int get(int key) {
        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);
        moveToHead(node);
        return node.value;
    }

    // put operation
    void put(int key, int value) {

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToHead(node);
        } else {

            if (map.size() == capacity) {
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key, value);
            addToHead(newNode);
            map.put(key, newNode);
        }
    }
    public static void main(String[] args) {
        LRU_DLLandMap lru = new LRU_DLLandMap(2);

        lru.put(1, 10);
        lru.put(2, 20);
        System.out.println(lru.get(1)); // 10
        lru.put(3, 30);
        System.out.println(lru.get(2)); // -1
    }
}
