class Solution {
    public String getHint(String secret, String guess) {

        int cows=0,bulls=0;
        String ans;

        int[] secretcount=new int[10];
        int[] guesscount=new int[10];
        for (int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            else{
                secretcount[secret.charAt(i)-'0']++;
                guesscount[guess.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<10;i++){
            cows+=Math.min(secretcount[i],guesscount[i]);
        }
         ans=bulls+"A"+cows+"B";
         return ans;

    }
}
