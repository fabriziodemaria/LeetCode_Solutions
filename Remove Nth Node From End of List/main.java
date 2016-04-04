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
    public ListNode removeNthFromEnd(ListNode head, int n) {
                if(head.next==null) return null;
                ListNode p2 = runner(head,n);
        ListNode p1 = head;
                //limit case if we have to eliminate the head (no p1 to be used)
        if(p2==null){
            //remove head
            return head.next;
        }
                        while(p2.next!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
                //eliminate p1's next
        p1.next=p1.next.next;
        return head;
    }
                        private ListNode runner(ListNode current, int n){
        while(n>0){
            current=current.next;
            n--;
        }
        return current;
    }
}
