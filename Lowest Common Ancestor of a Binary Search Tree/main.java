class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
                while (true) {
            int counterl = branchTraverse(root.left, p, q, 0);
            int counterr = branchTraverse(root.right, p, q, 0);
                        if (counterl == 1 && counterr == 1) {
                return root;
            }
                        if (counterl == 1 || counterr == 1) {
                if (root == p || root == q) {
                    return root;
                } else {
                    return null;
                }
            }
                        if (counterl == 2) {
                root = root.left;
            } else if (counterr == 2) {
                root = root.right;
            }
        }
    }
        private int branchTraverse(TreeNode current, TreeNode p, TreeNode q, int counter) {
        if (current == null) {
            return counter;
        }
                if (current == p || current == q) {
            counter++;
        }
                counter = branchTraverse(current.left, p, q, counter);
        counter = branchTraverse(current.right, p, q, counter);
        return counter;
    }
}
