class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
         StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
             freq[ch]++;
        }

        for(int i=0;i<s.length();i++){
            int max=freq[0];
            int max_indx=0;
            for(int j=1;j<128;j++){
                if(freq[j]>max){
                    max=freq[j];
                    max_indx=j;
                }
            }
            for(int k=0;k<max;k++) str.append((char)max_indx);
            freq[max_indx]=0;
        }
        return str.toString();
    }
}
