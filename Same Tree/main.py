class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
import pdb
class Solution(object):
    result = True
    def recur(self,p,q):
        if (p is None and q is None):
            return
        if (p is None and q is not None or p is not None and q is None):
            self.result = False
            return
        if(p.val != q.val):
            self.result = False
            return
                    self.recur(p.left,q.left)
        self.recur(p.right,q.right)
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        self.recur(p,q)
        return self.result
