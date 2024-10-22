bool isValid(char* word) {
    int len=strlen(word);
    int cv=0,cc=0;
    if(len<3){
        return false;
    }
    else{
        for(int i=0;i<len;i++){
            if(!isalnum(word[i])){
                return false;
            }
            else{
                 if ((word[i] == 'a' || word[i] == 'A') ||
            (word[i] == 'e' || word[i] == 'E') ||
            (word[i] == 'i' || word[i] == 'I') ||
            (word[i] == 'o' || word[i] == 'O') ||
            (word[i] == 'u' || word[i] == 'U')) {
            cv++;
        }

                else if(isalpha(word[i])){
                    cc++;
                }    
                }
            }
        }
   return (cv > 0 && cc > 0);
}
