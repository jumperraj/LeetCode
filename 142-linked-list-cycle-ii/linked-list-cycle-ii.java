/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode slow = head;
        // ListNote fast = head;
        // while(fast !=null && fast.next!= null){
        //     slow = slow.next ;
        //     fast = fast.next.next;
        //     if(fast == slow ){

        //     }
        ListNode node = head;
        // ListNode prev = null;
        HashSet<ListNode> hm = new HashSet<>();
            while(true){
                if(node == null) return null;
                if(hm.contains(node)) return node;
                // System.out.println(node.val+" -> ");
                hm.add(node);
                // prev= node;
                node = node.next;
            }
        }
}