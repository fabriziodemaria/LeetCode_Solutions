class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
        UndirectedGraphNode newnode;
    HashMap<Integer,UndirectedGraphNode> track = new HashMap<Integer,UndirectedGraphNode>();
        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
                if(node == null) return null;
        newnode = new UndirectedGraphNode(node.label);
        UndirectedGraphNode sol = newnode;
        track.put(node.label,newnode);
                Queue<UndirectedGraphNode> qold = new LinkedList<UndirectedGraphNode>();
        Queue<UndirectedGraphNode> qnew = new LinkedList<UndirectedGraphNode>();
                qold.add(node);
        qnew.add(newnode);
                //BFS
        while(!qold.isEmpty() && !qnew.isEmpty()){
            node = qold.remove();
            newnode = qnew.remove();
                        //copies of neighbors
            for(UndirectedGraphNode n : node.neighbors){
                UndirectedGraphNode tmp;
                if(track.containsKey(n.label)){
                    //this node we already created the copy of
                    tmp = track.get(n.label);
                    newnode.neighbors.add(tmp);
                    //do not add to the queue since we visited this node already
                } else {
                    //add it and update track map
                    tmp = new UndirectedGraphNode(n.label);
                    track.put(n.label, tmp);
                    newnode.neighbors.add(tmp);
                    //copy handled 
                    qold.add(n);
                    qnew.add(tmp);
                }
            }
        }
        return sol;
    }
}
