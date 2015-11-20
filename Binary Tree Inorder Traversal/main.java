class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        private List<Integer> result = new ArrayList<Integer>();
        public List<Integer> inorderTraversal(TreeNode root) {
                if(root == null) return new ArrayList<Integer>();
                inorderTraversal(root.left);
        result.add(new Integer(root.val));
        inorderTraversal(root.right);
                return result;
    }
}
