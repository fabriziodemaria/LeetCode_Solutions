class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Handle corner case
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
                //Save the head of the new list
        ListNode head = null;
        if (l1.val > l2.val) {
            head = l2;
            recursiveMerge(l2, l2.next, l1);
        } else {
            head = l1;
            recursiveMerge(l1, l2, l1.next);
        }
                return head;
    }
        private void recursiveMerge(ListNode current, ListNode l1, ListNode l2) {
        // Stopping condition for recursion
        if (l1 == null) {
            current.next = l2;
            return;
        } else if (l2 == null) {
            current.next = l1;
            return;
        }
                // Attach smaller on current 
        if (l1.val > l2.val) {
            current.next = l2;
            recursiveMerge(current.next, current.next.next, l1);
        } else {
            current.next = l1;
            recursiveMerge(current.next, current.next.next, l2);
        }
    }
    }
