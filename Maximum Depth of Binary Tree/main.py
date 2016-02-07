class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution(object):
    def __init__(self):
        self.maxD = 0
        self.result = 0
    def incMax(self):
        #pdb.set_trace()
        self.maxD += 1
        if self.maxD > self.result:
            self.result = self.maxD
    def recur(self,node):
        if node is None:
            return
        self.incMax()
        self.recur(node.left)
        self.recur(node.right)
        self.maxD -= 1
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.recur(root)
        return self.result
