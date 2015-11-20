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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                ListNode sol = l1;
        int tmpsum;
                        boolean addone = false;
        while(l1 != null && l2 != null){
            tmpsum = l1.val + l2.val;
            if(addone) tmpsum++;
            if(tmpsum>=10){
                l1.val = (tmpsum - 10);
                addone = true;
            } else {
                addone = false;
                l1.val = tmpsum;
            }
            if(l1.next == null && l2.next !=null){
                l1.next = new ListNode(0);
            } else if (l2.next == null && l1.next !=null){
                l2.next = new ListNode(0);
            } else if (l1.next==null && l2.next==null) {
                if(addone){
                    ListNode newnode = new ListNode(1);
                    l1.next = newnode;
                }
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return sol;
    }
}
