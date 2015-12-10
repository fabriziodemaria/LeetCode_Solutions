class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        public void flatten(TreeNode root) {
        recur(root);
    }
        private void recur(TreeNode current){
            if(current==null)return;
            recur(current.left);
        recur(current.right);
                if(current.left!=null && current.right!=null){
                        TreeNode tmp = current.right;
            current.right = current.left;
            TreeNode tmp2 = current.right;
            while(tmp2.right!=null) tmp2=tmp2.right;
            tmp2.right=tmp;
            current.left = null;
        } else if (current.left!=null && current.right==null){
            current.right= current.left;
            current.left = null;
        } 
        return;
    }
    }
