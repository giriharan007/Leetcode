/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int* countBits(int n, int* returnSize) {
    int* result = (int*)malloc((n + 1) * sizeof(int));
    *returnSize = n + 1;
    for (int i=0;i<=n;i++) {
        int x = i;
        int sum=0;
        while (x != 0) {
            sum = sum + x%2;
            x = x/2;
        }
        result[i] =sum;
    }
    return result;
}
