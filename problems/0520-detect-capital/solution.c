// bool detectCapitalUse(char* word) {
//     int len=strlen(word);
//     bool all_upper= true;
//     bool all_lower=true;
//     bool first_upper_rest_lower=true;

//     if (isupper(word[0])){
//         for(int i=1;i<len;i++){
//             if(isupper(word[i])){
//                first_upper_rest_lower=false; 
//             }
//         }
//     }
//     else{
//          first_upper_rest_lower=false;
//     }

//     for(int i=0;i<len;i++){
//         if(!isupper(word[i])){
//             all_upper=false;
//         }
//         if(!islower(word[i])){
//             all_lower=false;
//         }
//     }
//     return first_upper_rest_lower || all_lower || all_upper;
// }

bool detectCapitalUse(char* word) {

    int i=0;
    int count = 0;
    while( word[i]!='\0'){
        if( word[i]<97){
            count++;
        }
        i++;
    }

    if(count==strlen(word) || count ==0 || (count==1 &&  word[0]<97)){
        return true;
    }

    return false;
    
}
