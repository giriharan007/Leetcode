struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* temp1 = NULL;
    struct ListNode* temp2 = NULL;
    while(head!=NULL){
        temp2=head->next;
        head->next=temp1;
        temp1=head;
        head=temp2;
    }
    head=temp1;
    return head; 

    
}

