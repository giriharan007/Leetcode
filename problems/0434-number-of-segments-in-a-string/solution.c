int countSegments(char* s) {
    int c = 0;  
    int inSegment = 0;  
    int i = 0;

    while (s[i] != '\0') {
        if (s[i] != ' ') {
            if (inSegment==0) {
                c++;  
                inSegment = 1;
            }
        } else {
            inSegment = 0;
        }
        i++;
    }
    return c;
}

