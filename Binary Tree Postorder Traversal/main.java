class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        List<Integer> solution = new LinkedList<Integer>();
    Set<TreeNode> visited = new HashSet<TreeNode>();
        public List<Integer> postorderTraversal(TreeNode root) {
                Stack<TreeNode> stack = new Stack<TreeNode>();
                if(root==null) return solution;
                visited.add(root);
        stack.push(root);
                while(!stack.isEmpty()){
                        TreeNode current = stack.pop();
                        if((current.left==null || visited.contains(current.left)) &&
               (current.right==null || visited.contains(current.right))){
                    solution.add(current.val);
                    continue;
            }
                        //push back the current node if the "recursion" below it is not completed!!!!!!!!!
            stack.push(current);
                        //The order is important!!!! First the right since you want the right completed before the 
                left!!!!!
            if(current.right!=null && !visited.contains(current.right)){
                visited.add(current.right);
                stack.push(current.right);
            }
                        if(current.left!=null && !visited.contains(current.left)){
                visited.add(current.left);
                stack.push(current.left);
            }
                   }
                return solution;
            }
}
