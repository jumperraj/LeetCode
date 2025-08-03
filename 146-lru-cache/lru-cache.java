
class LRUCache {
    // PriorityQueue<Compare> pq ;
    Queue<Integer> q ;
    HashMap<Integer,Integer> hm;
    int size;
    public LRUCache(int capacity) {
        // pq== new PriorityQueue<>( (a,b)=>a.value-b.value);
        q= new ArrayDeque<>();
        hm = new HashMap<>();
        this.size = capacity;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            q.remove(key);
            q.offer(key);
            return hm.get(key);
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            q.remove(key);
            q.offer(key);
            hm.put(key,value);
       }
       else{
        q.offer(key);
            hm.put(key,value);
       }
       if(hm.size()>this.size){
        hm.remove(q.poll());
       }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */