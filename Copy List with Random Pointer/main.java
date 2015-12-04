class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
                        if(head==null) return null;
                HashMap<RandomListNode,RandomListNode> tracking = new HashMap<RandomListNode,RandomListNode>();
                RandomListNode current = head;
                //fill the hash map with all the nodes of the orginal and the new copies (without pointers yet)
        while(current!=null){
            tracking.put(current,new RandomListNode(current.label));
            current=current.next;
        }
        //set pointers
        for(RandomListNode rln : tracking.keySet()){
            RandomListNode originalnext = rln.next;
            tracking.get(rln).next = tracking.get(originalnext);
                        RandomListNode originalrandom = rln.random;
            if(originalrandom!=null)
                tracking.get(rln).random = tracking.get(originalrandom);
        }
        return tracking.get(head);
        }
}
