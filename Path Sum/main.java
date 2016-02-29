class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return recursiveSum(root, 0, sum);
    }
        private boolean recursiveSum(TreeNode current, int partialsum, int sum) {
        if (current == null) return false;
        if (current.left == null && current.right == null) {
            //Leaf node
            return ((partialsum += current.val) == sum) ?  true : false;
        }
                if (current.left != null && recursiveSum(current.left, partialsum + current.val, sum)) return 
            true;
        if (current.right != null && recursiveSum(current.right, partialsum + current.val, sum)) return 
            true;
        return false;
            }
}
