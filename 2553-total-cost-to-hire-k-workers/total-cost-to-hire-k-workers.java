class Solution {
    public long totalCost(int[] costs, int k, int c) {
        int i=0,j=costs.length-1,count=0,t=k;
        long sum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
           public int compare(Integer a, Integer b){
                if(costs[a]==costs[b]) return a>b ? b : a;
                return costs[a]-costs[b];
            }
        });
        //  PriorityQueue<Word> pq = new PriorityQueue<>(new Comparator<Word>() {
        //     // the compare method returns a positive or negative integer based on
        //     // these 2 elements, w1 and w2. return 1 means the current order is bad, swap. return -1
        //     // mean the current order is good, dont swap. if its equal to each other, usually
        //     // return 0 but in our case we will then sort by lex order using String.compareTo().
        //     @Override
        //     public int compare(Word w1, Word w2) {
        //         // ** w1 freq greater than w2 freq, keep the order. **
        //         // given some order of element 1, and element 2,
        //         // if the value of element 1 is greater than element 2, return a -1
        //         // which is a negative integer less than 0, don't swap! because this
        //         // is what we want, w1 (higher freq) to be in front of the w2 (lower freq).
        //         if(w1.freq > w2.freq) {
        //             return -1;
        //         }}});
         while(i<c&&j>=costs.length-1-c){
             if(i<j||i==j)
                pq.add(i);
            if(i<j)
                pq.add(j);
                i++;
                j--;
        }
        while(k-->0){
        int res=pq.poll();
        System.out.println("res "+res+" val "+costs[res]);
        if(i<=j){
        if(res<=i) {pq.add(i); i++;}
        else {pq.add(j);j--;}}
        sum+=costs[res];
        // count++;
        //  i+=t;j-=t;
        }
        return sum;
    }
}