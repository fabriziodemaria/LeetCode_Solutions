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
    public ListNode deleteDuplicates(ListNode n) {
                ListNode head = n;
                while(head != null){
            while(head.next!=null && head.next.val == head.val){
                head.next=head.next.next;
            }
            head = head.next;
        }
                return n;
    }
}
