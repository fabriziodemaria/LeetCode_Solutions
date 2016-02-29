class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        List<List<Integer>> solutions;
        //store a solution path that is updated along the recursion
    LinkedList<Integer> currentarr;
        //target is global
    int target;
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
                        solutions = new LinkedList<List<Integer>>();
                //handle border case
        if(root==null) return solutions;
        currentarr = new LinkedList<Integer>();
                target = sum;
        inorderSum(root,0);
                return solutions;
    }
        private void inorderSum(TreeNode current, int currsum){
                //check if it is null anyway (maybe just one btw left and right!)
        if(current==null) return;
                //if leaf...
        if(current.left == null && current.right == null){
                        if ((currsum+current.val)==target){
                currentarr.add(current.val);
                solutions.add((LinkedList<Integer>)currentarr.clone());
                currentarr.removeLast();
            }
            return;
        }
                //not a leaf
        currentarr.add(current.val);
        inorderSum(current.left, currsum + current.val);
        inorderSum(current.right, currsum + current.val);
        currentarr.removeLast();
    }
}
