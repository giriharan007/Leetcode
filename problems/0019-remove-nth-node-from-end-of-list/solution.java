
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode d= new ListNode(0);
        d.next=head;
        ListNode first = d;
        ListNode second= d;
        for(int i=0;i<=n;i++)
        { 
            first=first.next;
        } 
        while(first != null)
        {
            first=first.next;
            second=second.next;

        }
        second.next=second.next.next;
        return d.next;
    }
}
