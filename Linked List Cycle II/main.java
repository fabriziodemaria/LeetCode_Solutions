class ListNode {
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
                if(head==null) return null;
        if(head.next == null) return null;
        if(head.next.next == null) return null;
        if(head.next.next == head) return head;
                        ListNode fast = head.next.next;
        ListNode slow = head.next;
                while(fast!=slow){
            //check if no cycle!!!
            if(fast==null || fast.next==null) return null;
                        fast = fast.next.next;
            slow = slow.next;
        }
                fast = head;
                while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
                return fast;
            }
}
