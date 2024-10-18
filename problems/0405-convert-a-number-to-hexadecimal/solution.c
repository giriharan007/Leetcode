char* toHex(int num) {
        unsigned int q = (unsigned int)num; 


        if (num == 0) {
        char* zeroStr = malloc(2); 
        strcpy(zeroStr, "0");
        return zeroStr;
    }
    int rem[100],indx=0;
    char s[100]="";
    while(q!=0){
        rem[indx]=q%16;
        q=q/16;
        indx++;
    }

    for(int i=indx-1;i>=0;i--){
            if(rem[i]>=0 && rem[i]<=9){
            char str[3];
            sprintf(str,"%d",rem[i]);
            strcat(s,str);
        }
         else {
            char str[3]; 
            str[0] = 'a' + (rem[i] - 10);
            str[1] = '\0'; 
            strcat(s, str); 
}
    }
       char* result = malloc(strlen(s) + 1);
       strcpy(result, s); 
       return result; 
}
