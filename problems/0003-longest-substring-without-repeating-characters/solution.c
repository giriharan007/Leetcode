int lengthOfLongestSubstring(char* s) {
   int n = strlen(s);
    int lastIndex[256]; 
    for (int i = 0; i < 256; i++) {
        lastIndex[i] = -1;
    }

    int maxLength = 0; 
    int start = -1;   

    for (int i = 0; i < n; i++) {
    
        if (lastIndex[s[i]] > start) {
            start = lastIndex[s[i]];
        }


        lastIndex[s[i]] = i;

        int currentLength = i - start;
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
    }

    return maxLength; 
}
