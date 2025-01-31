class Solution {
    public boolean wordPattern(String pattern, String s) {
         
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length)  return false;
    
        Map<Character, String> m=new HashMap();
        HashSet set=new HashSet();
         char ch;
        for(int j=0;j<pattern.length();j++){
            ch=pattern.charAt(j);

            if(m.containsKey(ch)){
                  if(!m.get(ch).equals(arr[j])){
                    return false;
                  }
            }
            else if(set.contains(arr[j])){
                return false;
            }

            m.put(ch,arr[j]);
            set.add(arr[j]);
        }
        return true;

      
    }
}
