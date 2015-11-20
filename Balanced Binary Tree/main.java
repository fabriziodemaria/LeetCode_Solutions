class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return probe(root);
    }
        private boolean probe(TreeNode current){
                        if(current==null){
            return true;
        }
                        if(Math.abs(heightOfBinaryTree(current.left) - heightOfBinaryTree
            (current.right))>1){
            return false;
        }
                if(!probe(current.left)) return false;
        if(!probe(current.right)) return false;
                return true;
    }
        public int heightOfBinaryTree(TreeNode node)
{
    if (node == null)
    {
        return 0;
    }
    else
    {
        return 1 +
        Math.max(heightOfBinaryTree(node.left),
            heightOfBinaryTree(node.right));
    }
}
    }
