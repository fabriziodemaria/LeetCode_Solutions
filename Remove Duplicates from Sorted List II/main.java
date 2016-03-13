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
    public ListNode deleteDuplicates(ListNode head) {
                if(head == null) return null;
                //handle head
        while(head!=null){
            if(head.next != null && head.next.val == head.val){
                //eliminate all first section
                int tmp = head.val;
                while(head!=null && head.val == tmp){
                    head = head.next;
                }
            } else {
                break;
            }
        }
        if(head==null) return null;
                if(head.next == null) return head;
                ListNode current = head;
        ListNode current2 = head.next;
                while(current2 != null){
            while(current2!=null){
                if(current2.next != null && current2.val == current2.next.val){
                    //eliminate all after current
                    int tmp = current2.val;
                    while(current2 != null && current2.val == tmp){
                        current2 = current2.next;
                    }
                    current.next = current2;
                } else {
                    break;
                }
            }
            if(current2==null)break;
            current = current.next;
            current2 = current2.next;
        }
                return head;
            }
       }
