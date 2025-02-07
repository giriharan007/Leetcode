/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head;
    
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        
        ListNode curr=slow,prev=null,Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }

        ListNode left=head,right=prev;
        int ans=0;
        while(right!=null){
          ans=Math.max(ans,left.val+right.val);
          left=left.next;
          right=right.next;
        }

        return ans;
    }
}
