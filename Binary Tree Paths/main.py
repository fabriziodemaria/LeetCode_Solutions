class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    stack = []
    sol = []
        def binaryTreePathsRec(self, root):
        if root == None:
            return self.sol
        self.stack.append(root.val)
        if root.right == None and root.left == None:
            s = ""
            for element in self.stack:
                s+="%d->" % (element)
            s=s[:-2]
            self.sol.append(s)
        self.binaryTreePathsRec(root.left)
        self.binaryTreePathsRec(root.right)
        self.stack.pop()
        return self.sol
            # @param {TreeNode} root
    # @return {string[]}
    def binaryTreePaths(self, root):
        self.stack = []
        self.sol = []
        return self.binaryTreePathsRec(root)
         