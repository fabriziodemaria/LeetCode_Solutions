class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkMirror(root.left, root.right);  
    }
        private boolean checkMirror(TreeNode left, TreeNode right) {
                if (left==null && right !=null || left !=null && right == null) return false;
        if (left==null && right == null) return true;
                if (left.val == right.val) {
            if (!checkMirror(left.left, right.right)) return false;
            if (!checkMirror(left.right, right.left)) return false;  
            return true;
        } else {
            return false;
        }
    }
}
