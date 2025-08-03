class LRUCache {
    class Node {
        int value;
        int key;
        Node next;
        Node prev;
        Node(int key , int value){
            this.value =value;
            this.key = key;
            this.next=null;
            this.prev= null;
        }
    }
    Node[] map = new Node[10000+1];
    Node head,tail;
    int size;
    int count;
    public LRUCache(int capacity) {
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev= head;
        this.size = capacity;
        this.count =0;

    }
    void addNode(Node node){
        head.next.prev=node;
        node.next=head.next;
        head.next =node;
        node.prev=head;
    }
    void deleteNode(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    
    public int get(int key) {
        if(map[key]!=null){
            Node node = map[key];
            deleteNode(node);
            addNode(node);
            return node.value;
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map[key]!=null){
            Node node = map[key];
            node.value=value;
            deleteNode(node);
            addNode(node);
        }
        else {
            Node node = new Node(key,value);
            
            map[key]=node;
           
            if(this.size<=this.count){
                Node lru = this.tail.prev;
                map[lru.key]=null;
                this.deleteNode(lru);
                addNode(node);
            }
            else {
                this.count++;
                addNode(node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */