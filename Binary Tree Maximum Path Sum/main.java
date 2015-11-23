class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        int max;
        public int maxPathSum(TreeNode root) {
                if(root==null) return 0;
                max = root.val;
        int tmp = visit(root);
        if(tmp > max) max = tmp;
                return max;
            }
        private int visit(TreeNode current){
            if(current==null) return 0;
                int l = visit(current.left);
        int r = visit(current.right);
                if(l<0) l=0;
        if(r<0) r=0;
                int tmp = l+r+current.val;
        if(tmp>max) max = tmp;
                if(l>r) {return l+current.val;}
        else {return r+current.val;}
            }
        }
