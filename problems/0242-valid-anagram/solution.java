class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
      HashMap<Character,Integer> m1=new HashMap<>();
        
      for(int i=0;i<s.length();i++){
          m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
          m1.put(t.charAt(i),m1.getOrDefault(t.charAt(i),0)-1);                                            
      }  

     for (int value : m1.values()) {
            if (value != 0) return false;
        }

        return true;
    }
}    
