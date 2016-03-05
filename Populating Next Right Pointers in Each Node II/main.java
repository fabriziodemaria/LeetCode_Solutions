class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
            TreeLinkNode[] pointers;
        public void connect(TreeLinkNode root) {
        //check the heigth of tree
        //create an array of pointers to save nodes of each level (leftmost)
        pointers = new TreeLinkNode[checkH(root)];
                magic(root, 0);
                            }
            private void magic(TreeLinkNode current, int level){
                if(current==null) return;
                        if(pointers[level]!=null){
            //we previously saved a node so we considered the most left branch already
            pointers[level].next=current;
        } 
                //save the pointer for the level
        pointers[level] = current;
                magic(current.left,level+1);
        magic(current.right,level+1);
                return;
                    }
                    private int checkH(TreeLinkNode current){
                if(current == null){
            return 0;
        }
        return 1 + checkH(current.left) + checkH(current.right);
    }
    }
