class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        TreeNode root;
        public TreeNode sortedArrayToBST(int[] num) {
                if(num==null || num.length==0)return null;
        root = new TreeNode(num[(num.length)/2]);
        recurr(root,num,0,num.length-1);
        return root;
            }
        private void recurr(TreeNode current, int[] num, int s, int e){
                if(s>=e){
            return;
        }
                        int c = (s+e+1)/2;
        int l = (s+c)/2;
        int r = (c+e+2)/2;
                current.left = new TreeNode(num[l]);
        if(r<=e)
        {
            current.right = new TreeNode(num[r]);
        }
        if(current.left!=null)
        recurr(current.left,num,s,c-1);
        if(current.right!=null)
        recurr(current.right,num,c+1,e);
    }
    }
