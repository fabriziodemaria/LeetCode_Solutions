class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        List<Integer> solution;
        public Solution(){
        solution = new LinkedList();
    }
        public List<Integer> preorderTraversal(TreeNode root) {
                if(root==null){
            return solution;
        }
                //visit the node
        if(solution==null) solution = new LinkedList<Integer>();
        solution.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return solution;
            }
}
