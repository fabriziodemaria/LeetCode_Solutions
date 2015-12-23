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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
                if(headA == null || headB == null) return null;
                ListNode currentA = headA;
        ListNode currentB = headB;
                int cA = 0;
        int cB = 0;
                //counting the lists length 
        while(currentA != null){
            cA++;
            currentA = currentA.next;
        }
        while(currentB != null){
            cB++;
            currentB = currentB.next;
        }
                //set back the pointers at the beginning
        currentA = headA;
        currentB = headB;
                //managing the skew in the length of the lists
        int diff = Math.abs(cA-cB);
                if(cA>cB){
            for(int j = diff; j>0; j--){
                currentA = currentA.next;
            }
        } else {
            for(int j = diff; j>0; j--){
                currentB = currentB.next;
            }
        }
            //checking on the remaining parts
        while(currentA!=null && currentB!=null){
            if(currentA==currentB) return currentB;
            currentA = currentA.next;
            currentB = currentB.next;
        }
                return null;
            }
}
