class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1=magazine.length();
        int len2=ransomNote.length();
       if(len1<len2)  return false;
        int[] arr=new int[26];
        for(int i=0;i<len2;i++)  arr[ransomNote.charAt(i)-'a']++;
        for(int i=0;i<len1;i++)  arr[magazine.charAt(i)-'a']--;
       for(int val:arr){
          if(val>0)  return false;
       }
        return true;
    }
}
