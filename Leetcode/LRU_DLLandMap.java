import java.util.HashMap;

class NodeLRU {
    int key, value;
    NodeLRU prev, next;

    NodeLRU(int k, int v) {
        key = k;
        value = v;
    }
}

public class LRU_DLLandMap {

    int capacity;
    HashMap<Integer, NodeLRU> map;
    NodeLRU head, tail;

    // constructor
    public LRU_DLLandMap(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new NodeLRU(0, 0); // dummy head
        tail = new NodeLRU(0, 0); // dummy tail

        head.next = tail;
        tail.prev = head;
    }

    // remove NodeLRU from DLL
    void remove(NodeLRU NodeLRU) {
        NodeLRU.prev.next = NodeLRU.next;
        NodeLRU.next.prev = NodeLRU.prev;
    }

    // add NodeLRU right after head
    void addToHead(NodeLRU NodeLRU) {
        NodeLRU.next = head.next;
        NodeLRU.prev = head;

        head.next.prev = NodeLRU;
        head.next = NodeLRU;
    }

    // move existing NodeLRU to head
    void moveToHead(NodeLRU NodeLRU) {
        remove(NodeLRU);
        addToHead(NodeLRU);
    }

    // get operation
    int get(int key) {
        if (!map.containsKey(key))
            return -1;

        NodeLRU NodeLRU = map.get(key);
        moveToHead(NodeLRU);
        return NodeLRU.value;
    }

    // put operation
    void put(int key, int value) {

        if (map.containsKey(key)) {
            NodeLRU NodeLRU = map.get(key);
            NodeLRU.value = value;
            moveToHead(NodeLRU);
        } else {

            if (map.size() == capacity) {
                NodeLRU lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }

            NodeLRU newNodeLRU = new NodeLRU(key, value);
            addToHead(newNodeLRU);
            map.put(key, newNodeLRU);
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
