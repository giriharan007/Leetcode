bool repeatedSubstringPattern(char* s) {
    int len=strlen(s);
    for(int i=1;i<=len/2;i++){
        if(len%i==0){
            bool valid=true;

        for(int j=i;j<len;j++){
            if(s[j]!=s[j%i]){
                valid=false;
                break;
            }
        }
        if(valid){
            return true;
        }
    }
    }
    return false;
}
