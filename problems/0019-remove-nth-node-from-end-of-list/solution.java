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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n==0){
            return head;
        }
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        
        if(length==n){
            return head=head.next;
        }

        temp=head;
        while(length-1!=n && temp!=null){
            temp=temp.next;
            length--;
        }

        temp.next=temp.next.next;
        return head;
    }
}
