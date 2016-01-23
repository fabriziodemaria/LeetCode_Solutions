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
    public boolean hasCycle(ListNode head) {
                if (head==null){
            return false;
        }
                ListNode tmp = new ListNode(1);
                while(head.next != null){
            if(head.next == tmp){
                return true;
            }
            ListNode tmp2 = head;
            head = head.next;
            tmp2.next = tmp;
        }
        return false;
    }
}
