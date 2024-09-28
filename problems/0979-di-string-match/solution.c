/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* diStringMatch(char* s, int* returnSize) {
    int n=strlen(s);
    *returnSize=n+1;
    int I=0, D=n;
    int *arr=(int *)malloc((*returnSize) * sizeof(int));
 
    for(int i=0;i<n;i++){
        if(s[i]=='I'){
            arr[i]=I++;
        }
        else if(s[i]=='D'){
            arr[i]=D--;
        }
    }
    arr[n]=I;
    return arr;
}
