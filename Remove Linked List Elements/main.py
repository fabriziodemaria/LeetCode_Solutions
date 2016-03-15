class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    # @param {ListNode} head
    # @param {integer} val
    # @return {ListNode}
    def removeElements(self, head, val):
        # First element
        while head != None and head.val == val:
            head = head.next
        # Middle
        current = head
        while current != None and current.next != None: #Not the last element or null
            if current.next.val == val:
                current.next = current.next.next
                continue
            current = current.next
        return head
