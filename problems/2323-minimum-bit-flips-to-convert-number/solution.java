class Solution {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        int xor = start ^ goal;

        while (xor > 0) {
            c = c + (xor & 1);
            xor = xor >> 1;    
        }

        return c;
    }
}

