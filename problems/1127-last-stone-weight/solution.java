class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);

        ArrayList<Integer> l1=new ArrayList();
        for(int val:stones){
            l1.add(val);
        } 

        int n=stones.length;
        int n1,n2;
        while(n!=1){
            Collections.sort(l1);
            n1=l1.get(n-1);
            n2=l1.get(n-2);
            l1.remove(n-1);
            l1.remove(n-2);
            l1.add(n1-n2);
            n--;

        }

        return l1.get(0);
    }
}
