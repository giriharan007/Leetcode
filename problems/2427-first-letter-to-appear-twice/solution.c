char repeatedCharacter(char* s) {
    int arr[256]={0};
    for(int i=0;s[i]!='\0';i++){
        if(arr[(unsigned char)s[i]]>0){
            return s[i];
        }
        else{
            arr[(unsigned char)s[i]]++;
        }
    }
    return 0;
}
