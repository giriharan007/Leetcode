# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution(object):
    def removeElements(self, head, val):
        while head is not None and head.val == val:
            head = head.next
        
        current = head
        
    
        while current is not None and current.next is not None:
            if current.next.val == val:
                current.next = current.next.next  
            else:
                current = current.next  
        
        return head

       
        
