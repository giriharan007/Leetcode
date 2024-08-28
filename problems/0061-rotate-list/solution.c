/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    struct ListNode* oldtail=head;
    int length=1;
    if(head==NULL)
    {
        return head;
    }
    while(oldtail->next!=NULL){
        oldtail=oldtail->next;
        length++;
    }

     k=k%length;
     if (k == 0) {
        return head; 
    }
    oldtail->next=head;
    
    struct ListNode* newtail=head;

    for(int i=1;i<(length-k);i++){
        newtail=newtail->next;
}
struct ListNode* newhead = newtail->next;

newtail->next=NULL;
return newhead;    
}
