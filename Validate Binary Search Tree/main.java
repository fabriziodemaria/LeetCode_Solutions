class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        public boolean isValidBST(TreeNode root) {
                if(root==null) return true;
        if(root.left == null && root.right==null) return true;
        return checkBSTHelper(root);
            }
        //post order recursion for visiting every node
    private boolean checkBSTHelper(TreeNode current){
                if(current==null) return true;
                if(!checkBSTHelper(current.left)) return false;
        if(!checkBSTHelper(current.right)) return false;
                //for each node reached with post order visiting, check if left and right contain appropriate 
            values
        return (checkLower(current.left, current.val) && checkHigher(current.right, current.val));
                }
        //check if entire subtree contains only less than val
    private boolean checkLower(TreeNode current, int val){
                if(current==null) return true;
            if(!checkLower(current.left,val)) return false;
        if(!checkLower(current.right,val)) return false;
                if(current.val>=val) return false;
        return true;
    }
        //check if entire subtree contains only more than val
    private boolean checkHigher(TreeNode current, int val){
                if(current==null) return true;
            if(!checkHigher(current.left,val)) return false;
        if(!checkHigher(current.right,val)) return false;
                if(current.val<=val) return false;
        return true;
    }
}
