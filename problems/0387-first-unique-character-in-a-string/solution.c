int firstUniqChar(char* s) {
    int n=strlen(s);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(s[i]==s[j] &&i!=j){
                j=n+1;
            }
            if(j==n-1){
                return i;
            }
        }
    }
    return -1;
}
