class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0 || g.length==0){
            return 0;
        }    
        Arrays.sort(s);
        Arrays.sort(g);
        int c=0,i=0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                c++;
                i++;
            }  
            j++;
        }          
        return c; 
    }
}
