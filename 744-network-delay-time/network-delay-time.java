class Solution {
    class Pair {
        int node;
        int w;
        Pair(int node , int w){
            this.node = node;
            this.w= w;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> graph = new ArrayList<>();
        for(int i =0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : times){
            graph.get(edge[0]).add(new Pair(edge[1],edge[2]));
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.w - b.w);
        pq.offer(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            int u = cur.node;
            int w = cur.w;
            if(w > dist[u]) continue;
            for(Pair edge : graph.get(u)){
                int v = edge.node;
                int d = edge.w;             
                if(dist[u] + d < dist[v]){
                    dist[v]=  dist[u]+d;
                    pq.offer(new Pair(v,dist[v]));
                }
            }
        }
        int max =0;
        for(int i=1;i<=n;i++){
            if(dist[i]== Integer.MAX_VALUE) return -1;
            max= Math.max(max,dist[i]);
    
            }
    return max;}
}