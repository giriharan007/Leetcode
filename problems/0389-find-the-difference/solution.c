char findTheDifference(char* s, char* t) {
   int result=0;
   for(int i=0;i<strlen(s);i++){
     result^=s[i];
   }
   for(int j=0;j<strlen(t);j++){
    result^=t[j];
   }
   return result;
}
