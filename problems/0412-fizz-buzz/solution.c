/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

 char *intostr(int num){
    char* str = (char*)malloc(12 * sizeof(char));
    sprintf(str, "%d", num);
    return str;
 }
char** fizzBuzz(int n, int* returnSize) {
    char **ans=(char**)malloc(n*sizeof(char*));
    
    for(int i=1;i<=n;i++){

        if(i%3==0 && i%5==0){
            ans[i-1]=(char*)malloc(9 * sizeof(char));
            strcpy(ans[i - 1], "FizzBuzz");
        }

        else if(i%3==0){
            ans[i-1]=(char*)malloc(5 * sizeof(char));
            strcpy(ans[i - 1], "Fizz");
        }

        else if(i%5==0){
            ans[i - 1] = (char*)malloc(5 * sizeof(char)); 
            strcpy(ans[i - 1], "Buzz");
        }

        else{
            ans[i - 1] = intostr(i);
        }

    }
    *returnSize = n;
    return ans;
    
}
