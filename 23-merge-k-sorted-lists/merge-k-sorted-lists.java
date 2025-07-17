/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val - b.val);
        ListNode cur;
        for(ListNode a : lists){
            cur = a;
            while(cur != null){
                pq.add(cur);
                // System.out.print(cur.val+" -> ");
                cur = cur.next;
            }
            // System.out.println("");
        }
        cur = pq.poll();
        ListNode head = cur;
        while(!pq.isEmpty()){
            cur.next = pq.poll();
            // System.out.println(cur.next.val+"cur.next.val");
            cur = cur.next;
        }
        if(cur!=null)
            cur.next=null;
        return head;
    }
}