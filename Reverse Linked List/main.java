class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) {
            return null;
        }
        ListNode next = head.next;
        head.next = null;
        return reverseLL(head, next);
    }
        private ListNode reverseLL(ListNode current, ListNode next) {
        if (next == null) {
            return current;
        }
                ListNode nextnext = next.next;
        next.next = current;
        return reverseLL(next, nextnext);
    }
}
