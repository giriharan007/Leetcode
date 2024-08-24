/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
   int sum=0;
   int carry=0;
   struct ListNode *dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
   struct ListNode *l3=dummy;
   while(l1 || l2 || carry){
    sum=carry;
    if(l1){
        sum=sum+l1->val;
        l1=l1->next;
    }
    if(l2){
        sum=sum+l2->val;
        l2=l2->next;
    }
    carry=sum/10;
    sum=sum%10;
    l3->next=(struct ListNode*)malloc(sizeof(struct ListNode));
    l3=l3->next;
    l3->val=sum;
    l3->next=NULL;
   } 
   struct ListNode *ans=dummy->next;
   free(dummy);
   return ans;
}
