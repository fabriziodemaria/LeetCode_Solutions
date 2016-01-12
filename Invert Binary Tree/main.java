class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode current) {
        if (current == null) {
            return null;
        }
                invertTree(current.left);
        invertTree(current.right);
                TreeNode tmp = current.left;
        current.left = current.right;
        current.right = tmp;
                return current;
    }
}
