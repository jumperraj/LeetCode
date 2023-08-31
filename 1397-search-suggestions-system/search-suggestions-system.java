class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        List<List<String>> lr = new ArrayList();
        int i=0;
        while(i<searchWord.length()){
        for(String s : products){
            if(i<s.length()&&s.substring(0,i+1).equals(searchWord.substring(0,i+1))){
                pq.add(s);
            }
        }
        List<String> l=new ArrayList();
        while(!pq.isEmpty()&&l.size()<3)
        l.add(pq.poll());
        pq= new PriorityQueue<>();
        lr.add(l);
        i++;
        }
  
        return lr;
    }
}