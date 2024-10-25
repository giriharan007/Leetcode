/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) 
{
   if(head==NULL || head->next==NULL){
    return true;
   }

    struct ListNode *slow = head;
    struct ListNode *fast = head;

   while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    struct ListNode* prev = NULL;
    struct ListNode* curr = slow;
    struct ListNode* nextNode;

    while (curr != NULL) {
        nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
    }

    struct ListNode* secondHalf = prev;
    struct ListNode* firstHalf = head;

     while (secondHalf != NULL) {
        if (firstHalf->val != secondHalf->val) {
            return false; 
        }
        firstHalf = firstHalf->next;
        secondHalf = secondHalf->next;
    }
    return true;

    
}


