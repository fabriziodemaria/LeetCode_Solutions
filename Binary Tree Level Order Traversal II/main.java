class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<List<Integer>> resultReverse = new ArrayList<List<Integer>>();
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
        orderRecur(root, 0);
                for (int i = result.size()-1; i >= 0; i--) {
            resultReverse.add(result.get(i));
        }
                return resultReverse;
    }
        private void orderRecur(TreeNode current, int level) {
        if (current == null) {
            return;
        }
                if (level == result.size()) {
            List<Integer> entry = new ArrayList<Integer>();
            entry.add(new Integer(current.val));
            result.add(entry);
        } else {
            result.get(level).add(new Integer(current.val));
        }
                orderRecur(current.left, level + 1);
        orderRecur(current.right, level + 1);
    }
    }
