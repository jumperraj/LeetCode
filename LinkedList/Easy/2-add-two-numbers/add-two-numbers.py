# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1, l2):
        re = p = ListNode(0)
        carry = 0
        while l1 or l2 or carry:
            v1 = v2 = 0
            if l1:
                v1 = l1.val
                l1 = l1.next
            if l2:
                v2 = l2.val
                l2 = l2.next
                
            if v1 + v2 + carry > 9:
                p.val = v1 + v2 + carry - 10
                carry = 1
            else:
                p.val = v1 + v2 + carry
                carry = 0
                
            if l1 or l2 or carry:
                p.next = ListNode(0)
                p = p.next
            
        return re
        