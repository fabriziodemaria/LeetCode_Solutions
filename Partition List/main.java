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
    public ListNode partition(ListNode head, int x) {
                ListNode l = new ListNode(0);
        ListNode r = new ListNode(0);
        //remember to eliminate the dummies
                //running pointers
        ListNode nl = l;
        ListNode rl = r;
                //comparison
        while(head!=null){
            ListNode tmp = new ListNode(head.val);
            if(head.val<x){
                nl.next = tmp;
                nl = tmp;
            } else if(head.val>=x){
                rl.next = tmp;
                rl = tmp;
            }
            head=head.next;
        }
                //eliminating dummies
        l = l.next;
        r = r.next;
                //constructing result (nl,cl,rl are the end of the single lists)
        if(l!=null){
            if (r!=null) {
                nl.next = r;
            }
            return l;
        }
        return r;
    }
}
